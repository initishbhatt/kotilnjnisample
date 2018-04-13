package com.initishbhatt.kotilnjnisample

/**
 * @author nitishbhatt
 */
class NativeStore {
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String
    external fun testFunction():Int

    companion object {

        @JvmStatic
        fun testMethod(numOne: Int, numTwo: Int) = numOne + numTwo

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}