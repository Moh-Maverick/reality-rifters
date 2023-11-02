package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.ar.core.ArCoreApk
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

import io.github.sceneview.ar.ARSceneView
import io.github.sceneview.node.ModelNode


class camera3 : AppCompatActivity() {
    lateinit var sceneview:ARSceneView
    lateinit var placeButton:ExtendedFloatingActionButton
    lateinit var modelnode:ArModelnode


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.camera3)



    }
}