LPU Android CA1 Submission - CA1

| Key | Value |
|--|--|
| Name | Ankur Paul |
| Section | K19HZ |
| Roll No. | RKO103B41 |



**Problem-1 Solution**  
  
### Code: (Kotlin & XML)  

    package com.example.continuousassessmentone  
      
    import androidx.appcompat.app.AppCompatActivity  
    import android.os.Bundle  
    import java.lang.NullPointerException  
      
    class QuestionTwo : AppCompatActivity() {  
    override fun onCreate(savedInstanceState: Bundle?) {  
    super.onCreate(savedInstanceState)  
    // Hiding the title bar  
    try {  
    this.supportActionBar!!.hide()  
    } catch (e: NullPointerException) {  
    }  
    setContentView(R.layout.activity_question_two)  
    }  
    }

<br/>
    
    <?xml version="1.0" encoding="utf-8"?>  
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android" android:layout_width="match_parent" android:layout_height="match_parent" android:background="@color/dark_pink" android:gravity="center" android:orientation="vertical" android:padding="50dp">  
      
      <ImageView android:layout_width="200dp" android:layout_height="200dp" android:src="@drawable/user_avatar" />  
      
      <LinearLayout android:layout_width="200dp" android:layout_height="wrap_content" android:orientation="horizontal">  
      
      <Button android:layout_width="100dp" android:layout_height="wrap_content" android:text="Log In" android:textAllCaps="false" android:textSize="15sp" />  
      
      <Button android:layout_width="100dp" android:layout_height="wrap_content" android:text="Sign Up" android:textAllCaps="false" android:textSize="15sp" />  
      </LinearLayout>  
      
      <LinearLayout android:layout_width="200dp" android:layout_height="wrap_content" android:layout_gravity="center" android:orientation="horizontal">  
      
      <ImageView android:layout_width="50dp" android:layout_height="50dp" android:layout_weight="0.3" android:src="@drawable/twitter_icon" />  
      
      <ImageView android:layout_width="50dp" android:layout_height="50dp" android:layout_weight="0.3" android:src="@drawable/facebook_icon" />  
      
      <ImageView android:layout_width="50dp" android:layout_height="50dp" android:layout_weight="0.3" android:src="@drawable/gplus_icon" />  
      </LinearLayout>  
      
      <LinearLayout android:layout_width="200dp" android:layout_height="wrap_content" android:layout_marginBottom="10dp" android:orientation="vertical">  
      
      <TextView android:layout_width="match_parent" android:layout_height="wrap_content" android:text="Username / Email Address" android:textAlignment="center" android:textSize="15sp" />  
      
      <EditText android:layout_width="match_parent" android:layout_height="wrap_content" android:hint="vkpandey@gmail.com" android:textAlignment="center" android:textSize="15sp" />  
      </LinearLayout>  
      
      <LinearLayout android:layout_width="200dp" android:layout_height="wrap_content" android:layout_gravity="center" android:layout_marginBottom="10dp" android:orientation="vertical">  
      
      <TextView android:layout_width="match_parent" android:layout_height="wrap_content" android:text="Password" android:textAlignment="center" android:textSize="15sp" />  
      
      <EditText android:layout_width="match_parent" android:layout_height="wrap_content" android:hint="" android:inputType="textPassword" android:textSize="15sp" />  
      </LinearLayout>  
      
      <LinearLayout android:layout_width="200dp" android:layout_height="wrap_content" android:layout_gravity="center" android:layout_marginBottom="10dp" android:orientation="horizontal">  
      
      <CheckBox android:layout_width="wrap_content" android:layout_height="wrap_content" />  
      
      <TextView android:layout_width="match_parent" android:layout_height="wrap_content" android:text="Remember Me" android:textSize="15sp" />  
      </LinearLayout>  
      
      <Button android:layout_width="200dp" android:layout_height="wrap_content" android:text="DONE ⏩" android:textSize="18sp" />  
    </LinearLayout>
