LPU Android CA1 Submission - CA1

| Key | Value | |--|--| | Name | Ankur Paul | | Section | K19HZ | | Roll No. | RKO103B41 |

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

---



**Problem-2 Solution**

### Code: (Kotlin & XML)

    package com.example.continuousassessmentone 

	import androidx.appcompat.app.AppCompatActivity import android.os.Bundle import java.lang.NullPointerException 
    
    class QuestionThree : AppCompatActivity() { 
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState) // Hiding the title bar try { this._supportActionBar_!!.hide()  
      } catch (e: NullPointerException) {  
      }  
      
      setContentView(R.layout._activity_question_three_)  
      }  
    }

<br/>

      <?xml version="1.0" encoding="utf-8"?>  
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android" xmlns:app="http://schemas.android.com/apk/res-auto" xmlns:tools="http://schemas.android.com/tools" android:layout_width="match_parent" android:layout_height="match_parent">  
      
      
      <RelativeLayout android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_centerInParent="true" android:layout_marginStart="15dp" android:layout_marginTop="5dp" android:layout_marginEnd="15dp" android:layout_marginBottom="5dp" android:background="#F6EA80" android:elevation="5dp" android:padding="5dp" android:translationZ="5dp">  
      
      <com.google.android.material.textfield.TextInputLayout android:id="@+id/til_holder" style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_marginLeft="3dp" android:layout_marginTop="10dp" android:layout_marginRight="3dp" android:textColorHint="@color/amber" app:boxStrokeColor="@color/amber" app:boxStrokeWidth="1dp" app:hintTextColor="@color/amber">  
      
      <com.google.android.material.textfield.TextInputEditText android:id="@+id/tie_Username" android:layout_width="match_parent" android:layout_height="wrap_content" android:backgroundTint="#F3E88A" android:fontFamily="@font/segoe_ui" android:hint="Intern Name" android:shadowColor="#040101" android:shadowDx="2" android:shadowDy="2" android:textColor="@color/amber" android:textColorHint="@color/amber" android:textSize="18sp" android:textStyle="bold">  
      
      </com.google.android.material.textfield.TextInputEditText>  
      </com.google.android.material.textfield.TextInputLayout>  
      
      <TextView android:id="@+id/tv_t4" android:layout_width="wrap_content" android:layout_height="wrap_content" android:layout_below="@id/til_holder" android:layout_centerInParent="true" android:layout_marginLeft="5dp" android:layout_marginTop="10dp" android:fontFamily="@font/segoe_ui" android:shadowColor="#040101" android:text="Select your gender" android:textColor="@color/amber" android:textSize="18sp" android:textStyle="bold" />  
      
      <RadioGroup android:id="@+id/rg_gender" android:layout_width="200dp" android:layout_height="wrap_content" android:layout_below="@id/tv_t4" android:layout_centerInParent="true" android:layout_marginLeft="10dp" android:layout_marginTop="10dp">  
      
      <RadioButton android:id="@+id/radio_b_male" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_gravity="center_horizontal" android:buttonTint="@color/amber" android:fontFamily="@font/segoe_ui" android:paddingLeft="5dp" android:shadowColor="#040101" android:text="Male" android:textColor="@color/amber" android:textSize="15sp" android:textStyle="italic|bold" />  
      
      <RadioButton android:id="@+id/radio_b_female" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_gravity="center_horizontal" android:buttonTint="@color/amber" android:fontFamily="@font/segoe_ui" android:paddingLeft="5dp" android:shadowColor="#040101" android:text="Female" android:textColor="@color/amber" android:textSize="15sp" android:textStyle="italic|bold" />  
      
      <RadioButton android:id="@+id/radio_b_others" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_gravity="center_horizontal" android:layout_marginLeft="-2dp" android:buttonTint="@color/amber" android:fontFamily="@font/segoe_ui" android:paddingLeft="5dp" android:shadowColor="#040101" android:text="Others" android:textColor="@color/amber" android:textSize="15sp" android:textStyle="italic|bold" />  
      </RadioGroup>  
      
      <TextView android:id="@+id/tv_t5" android:layout_width="wrap_content" android:layout_height="wrap_content" android:layout_below="@id/rg_gender" android:layout_marginLeft="5dp" android:layout_marginTop="10dp" android:fontFamily="@font/segoe_ui" android:shadowColor="#040101" android:text="Select your domain" android:textColor="@color/amber" android:textSize="18sp" android:textStyle="bold" />  
      
      <CheckBox android:id="@+id/cb_java" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_below="@id/tv_t5" android:layout_marginLeft="10dp" android:layout_marginTop="10dp" android:buttonTint="@color/amber" android:fontFamily="@font/segoe_ui" android:shadowColor="#040101" android:text="Android Development : JAVA" android:textColor="@color/amber" android:textSize="15sp" android:textStyle="bold|italic" />  
      
      <CheckBox android:id="@+id/cb_flutter" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_below="@id/cb_java" android:layout_marginLeft="10dp" android:buttonTint="@color/amber" android:fontFamily="@font/segoe_ui" android:shadowColor="#040101" android:text="Android Development : FLUTTER" android:textColor="@color/amber" android:textSize="15sp" android:textStyle="bold|italic" />  
      
      <CheckBox android:id="@+id/cb_kotlin" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_below="@id/cb_flutter" android:layout_marginLeft="10dp" android:buttonTint="@color/amber" android:fontFamily="@font/segoe_ui" android:shadowColor="#040101" android:text="Android Development : KOTLIN" android:textColor="@color/amber" android:textSize="15sp" android:textStyle="bold|italic" />  
      
      <Button android:id="@+id/btn_submit" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_below="@id/cb_kotlin" android:layout_centerHorizontal="true" android:layout_marginLeft="5dp" android:layout_marginTop="10dp" android:layout_marginRight="5dp" android:backgroundTint="@color/gray" android:elevation="5dp" android:fontFamily="@font/segoe_ui" android:paddingTop="8dp" android:paddingBottom="8dp" android:shadowColor="#B67474" android:shadowDx="2" android:shadowDy="2" android:shadowRadius="3" android:text="submit" android:textColor="@color/white" android:textSize="20sp" android:textStyle="bold" android:translationZ="5dp" />  
      </RelativeLayout>  
    </RelativeLayout>

---
