package other.template.res.layout

fun mvpFragmentXml(
    pageName: String,
    isHaveList:Boolean
) = """
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:skin="http://schemas.android.com/android/skin"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    
    ${
        if (isHaveList){
            """
                <androidx.recyclerview.widget.RecyclerView
                    android:id="@+id/rv_list"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent" />
            """
        }else{
            """
                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="${pageName}"/>
            """
        }
    }
    

    

</RelativeLayout>
"""