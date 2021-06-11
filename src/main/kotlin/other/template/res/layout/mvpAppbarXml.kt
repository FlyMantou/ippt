package other.template.res.layout

fun mvpAppbarXml(
    pageName: String
) = """
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:skin="http://schemas.android.com/android/skin"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <androidx.coordinatorlayout.widget.CoordinatorLayout
        android:id="@+id/coordinator_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <com.google.android.material.appbar.AppBarLayout
            android:id="@+id/app_bar_layout"
            android:orientation="vertical"
            android:layout_width="match_parent"
            app:elevation="0dp"
            android:layout_height="wrap_content">
    
    
            <com.google.android.material.appbar.CollapsingToolbarLayout
                android:id="@+id/collapsing_layout"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:minHeight="?attr/actionBarSize"
                app:contentScrim="@color/red_ed6b67"
                app:layout_scrollFlags="scroll|exitUntilCollapsed"
                app:statusBarScrim="@color/red_ed6b67"
                skin:enable="true">
    
    
                <!--折叠收缩布局-->
                <RelativeLayout
                    android:layout_width="match_parent"
                    android:layout_height="163dp">
    
                    <ImageView
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        skin:enable="true" />
    
                    <LinearLayout
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_alignParentBottom="true"
                        android:orientation="horizontal">
    
                    </LinearLayout>
                </RelativeLayout>
                <!--折叠固定布局-->
                <androidx.appcompat.widget.Toolbar
                    android:id="@+id/tool_title_bar"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:fitsSystemWindows="true"
                    android:orientation="horizontal"
                    app:contentInsetLeft="0dp"
                    app:contentInsetStart="0dp"
                    app:layout_collapseMode="pin">

                    <RelativeLayout
                        android:id="@+id/title_layout"
                        android:layout_width="match_parent"
                        android:layout_height="?android:attr/actionBarSize"
                        android:background="@color/transparent"
                        android:gravity="center_vertical"
                        android:orientation="horizontal">

                        <RelativeLayout
                            android:id="@+id/rl_back"
                            android:layout_width="?android:attr/actionBarSize"
                            android:layout_height="match_parent">

                            <TextView
                                android:id="@+id/tv_back"
                                android:layout_width="9dp"
                                android:layout_height="16.5dp"
                                android:layout_centerVertical="true"
                                android:layout_marginLeft="15dp"
                                android:background="@drawable/icon_back"
                                skin:enable="true" />
                        </RelativeLayout>

                        <TextView
                            android:id="@+id/titleName"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_centerInParent="true"
                            android:layout_weight="1"
                            android:gravity="center"
                            android:textColor="@color/white_ffffff"
                            android:textSize="21sp"
                            skin:enable="true" />

                    </RelativeLayout>

                </androidx.appcompat.widget.Toolbar>
    
    
            </com.google.android.material.appbar.CollapsingToolbarLayout>
            <!--上滑固定顶端布局-->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical">
    
                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical">
    
                    <com.flyco.tablayout.CommonTabLayout
                        android:layout_width="match_parent"
                        android:layout_height="@dimen/dp_47"
                        android:layout_gravity="center_vertical"
                        android:background="@color/white_ffffff"
                        android:paddingLeft="5dp"
                        android:paddingRight="5dp"
                        android:visibility="visible"
                        skin:enable="true"
                        app:tl_iconVisible="false"
                        app:tl_indicator_color="@color/blue_3982f7"
                        app:tl_indicator_corner_radius="@dimen/dp_14"
                        app:tl_indicator_gravity="BOTTOM"
                        app:tl_indicator_height="@dimen/dp_3"
                        app:tl_indicator_margin_left="@dimen/dp_5"
                        app:tl_indicator_margin_right="@dimen/dp_5"
                        app:tl_indicator_margin_top="@dimen/dp_11"
                        app:tl_indicator_width="@dimen/dp_40"
                        app:tl_tab_space_equal="true"
                        app:tl_textSelectColor="@color/blue_3982f7"
                        app:tl_textUnselectColor="@color/gray_666666"
                        app:tl_textsize="@dimen/sp_16" />
    
    
                </LinearLayout>
    
            </LinearLayout>
        </com.google.android.material.appbar.AppBarLayout>

        <androidx.viewpager.widget.ViewPager
            android:id="@+id/viewpager"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:textColor="@color/white_ffffff"
            app:layout_behavior="@string/appbar_scrolling_view_behavior"
            skin:enable="true" />
    </androidx.coordinatorlayout.widget.CoordinatorLayout>

</RelativeLayout>
"""