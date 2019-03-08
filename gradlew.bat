<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:background="#00A878"
    android:layout_height="match_parent"
    tools:context=".Activity.SplashActivity">

    <ImageView
        android:src="@drawable/ic_feather_pen"
        android:layout_width="159dp"
        android:layout_height="159dp"
        android:layout_marginTop="8dp"
        app:layout_constraintTop_toTopOf="parent"
        android:layout_marginBottom="8dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:layout_marginEnd="8dp"
        app:layout_constraintStart_toStartOf="parent"
        android:layout_marginStart="8dp"
        android:contentDescription="TODO"
        app:layout_constraintVertical_bias="0.392"/>


    <TextView
            android:layout_width="0dp"
            android:text="@string/cs_entry"
            android:textColor="#fff"
            android:textSize="36dp"
            android:layout_height="wrap_content"
            android:layout_marginTop="336dp"
            app:layout_constraintTop_toTopOf="parent"
            android:layout_marginEnd="8dp"
            app:layout_constraintEnd_toEndOf="parent"
            android:layout_marginStart="8dp"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintHorizontal_bias="0.498"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintVertical_bias="0.271"
            android:textAlignment="center"
            android:fontFamily="@font/lato" android:id="@+id/textView6"/>

    <com.google.android.material.button.MaterialButton

            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Retry"
            style="@style/Widget.MaterialComponents.Button.OutlinedButton"
            app:strokeColor="@android:color/white"
            android:textColor="@android:color/white"
         