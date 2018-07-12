package com.example.admin.patriots;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    FirebaseUser user1;
    EditText etname, etemail,etage, etpassword, etconfirm, etPhoneNumber;
    String name, email, password, age, confirm, PhoneNumber ;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();

        etname = (EditText) findViewById(R.id.regName);
        etemail = (EditText) findViewById(R.id.regEmail);
        etpassword = (EditText) findViewById(R.id.regPassword);
        etage = (EditText) findViewById(R.id.regAge);
        etconfirm = (EditText) findViewById(R.id.regRePassword);
        etPhoneNumber = (EditText) findViewById(R.id.regPhoneNumber);
        progressBar=(ProgressBar)findViewById(R.id.progressbar);
        progressBar.setVisibility(View.GONE);
    }


    public void Registered(View view) {

        name = etname.getText().toString().trim();
        email = etemail.getText().toString().trim();
        password = etpassword.getText().toString().trim();
        age = etage.getText().toString().trim();
        confirm = etconfirm.getText().toString().trim();
        PhoneNumber = etPhoneNumber.getText().toString().trim();

        if (name.isEmpty()) {
            etname.setError("Name Required");
            etname.requestFocus();
            return;
        }

        if (email.isEmpty()) {
            etemail.setError("Email Required");
            etemail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            etemail.setError("Enter a valid Email");
            etemail.requestFocus();
            return;
        }


        if (PhoneNumber.isEmpty()) {
            etPhoneNumber.setError("Phone Number Required");
            etPhoneNumber.requestFocus();
            return;
        }
        if (PhoneNumber.length() != 10) {
            etPhoneNumber.setError("Enter a valid number");
            etPhoneNumber.requestFocus();
            return;
        }

        if (age.isEmpty()) {
            etage.setError("Age Required");
            etage.requestFocus();
            return;
        }


        if (password.isEmpty()) {
            etpassword.setError("Password Required");
            etpassword.requestFocus();
            return;
        }


        if (password.length() < 6) {
            etpassword.setError("Enter Atleast 6 characters");
            etpassword.requestFocus();
            return;
        }

        if (confirm.isEmpty()) {
            etconfirm.setError("Password Required");
            etconfirm.requestFocus();
            return;
        }

        if (!confirm.equals(password)) {
            etconfirm.setError("Password Donot Match");
            etconfirm.requestFocus();
            return;
        }


        progressBar.setVisibility(View.VISIBLE);

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility(View.GONE);
                if (task.isSuccessful()) {
                    User user = new User(name, email, PhoneNumber, age,password, confirm);

                    FirebaseDatabase.getInstance().getReference("Users")
                            .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                            .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            progressBar.setVisibility(View.GONE);
                            if (!task.isSuccessful()) {
                                if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                                    Toast.makeText(getApplicationContext(), "You are already registered", Toast.LENGTH_SHORT).show();

                                } else {
                                    Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            } else {


                                user1 = mAuth.getCurrentUser();
                                if (user1 != null) {
                                    userprofile();
                                    Toast.makeText(RegisterActivity.this, "Please Login to continue", Toast.LENGTH_SHORT).show();
                                     finish()           ;
                                     mAuth.signOut();
                                    Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                                    startActivity(i);

                                }


                            }
                        }
                    });

                } else {
                    Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_LONG).show();
                }

            }
        });

    }
    private void userprofile() {
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest.Builder()
                    .setDisplayName(etname.getText().toString())
                    .build();
            // Toast.makeText(signup.this, "name updated", Toast.LENGTH_SHORT).show();
            user.updateProfile(userProfileChangeRequest).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful()) {
                        Log.d("Testing", "user profile updated");
                    }
                }
            });
        }
    }
}
