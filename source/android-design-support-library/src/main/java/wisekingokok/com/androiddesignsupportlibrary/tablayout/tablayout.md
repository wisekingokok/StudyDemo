### 定义

TabLayout提供了一个水平的布局用来展示Tabs。

### 基础语法

第一种用法：

XML:

    <android.support.design.widget.TabLayout

      android:id="@+id/tabLayout"

      android:layout_width="wrap_content"

      android:layout_height="wrap_content"/>

Java Code:

    tabLayout= (TabLayout) findViewById(R.id.tabLayout);

        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));

        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));

        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));

第二种用法：


    <android.support.design.widget.TabLayout

      android:layout_width="wrap_content"

      android:layout_height="wrap_content">

        <android.support.design.widget.TabItem

          android:layout_width="wrap_content"

          android:layout_height="wrap_content"

          android:text="Tab1"/>

        ...

    </android.support.design.widget.TabLayout>

第三种用法：

    ViewPager viewPager = ...;
    TabLayout tabLayout = ...;
    viewPager.addOnPageChangeListener(new TabLayoutOnPageChangeListener(tabLayout));

常用属性：

    1.改变选中字体的颜色
    app:tabSelectedTextColor="@android:color/holo_orange_light"

    2.改变未选中字体的颜色
    app:tabTextColor="@color/colorPrimary"

    3.改变指示器下标的颜色
    app:tabIndicatorColor="@android:color/holo_orange_light"

    4.改变整个TabLayout的颜色
    app:tabBackground="color"

    5.设置文字的外貌
    app:tabTextAppearance="@android:style/TextAppearance.Holo.Large"

    6.改变指示器下标的高度
    app:tabIndicatorHeight="4dp"

    7.添加图标
    tabLayout.addTab(tabLayout.newTab().setText("Tab 1").setIcon(R.mipmap.ic_launcher));

    8.tab模式（滚动 or 固定）
    app:tabMode="scrollable"

    9.内容显示模式（填满 or 居中）
    app:tabGravity="center"

### Material Design设计规范
