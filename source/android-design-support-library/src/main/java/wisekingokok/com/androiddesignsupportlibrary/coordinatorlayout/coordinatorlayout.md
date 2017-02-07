### 定义

CoordinatorLayout是这次新添加的一个增强型的FrameLayout.可以通过Behaviors调度协调子布局。
CoordinatorLayout的使用核心是Behavior，Behavior就是执行你定制的动作。
在讲Behavior之前必须先理解两个概念：Child和Dependency，什么意思呢？
Child当然是子View的意思了，是谁的子View呢，当然是CoordinatorLayout的子View；
其实Child是指要执行动作的CoordinatorLayout的子View。
而Dependency是指Child依赖的View。
简而言之，就是如过Dependency这个View发生了变化，
那么Child这个View就要相应发生变化。
发生变化是具体发生什么变化呢？
这里就要引入Behavior，Child发生变化的具体执行的代码都是放在Behavior这个类里面。

### 使用方法

    <android.support.design.widget.CoordinatorLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context="wisekingokok.com.androiddesignsupportlibrary.coordinatorlayout.CoordinatorLayoutActivity">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#017311"
            android:text="hello"
            app:layout_behavior="wisekingokok.com.androiddesignsupportlibrary.coordinatorlayout.MyBehavior"/>



        <TextView android:id="@+id/tv"
            android:layout_width="50dp"
            android:layout_height="50dp"
            android:layout_marginTop="50dp"
            android:layout_marginStart="50dp"
            android:background="#3366CC"/>

    </android.support.design.widget.CoordinatorLayout>

### Tips
自定义Behavior

        @Override
        public boolean layoutDependsOn(CoordinatorLayout parent, V child, View dependency) {
            //返回false表示child不依赖dependency，ture表示依赖
            return true;
        }

        //每次dependency位置发生变化，都会执行onDependentViewChanged方法
        @Override
        public boolean onDependentViewChanged(CoordinatorLayout parent, TextView btn, View dependency) {}

