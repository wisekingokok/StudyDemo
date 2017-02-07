### 定义

AppBarLayout继承自LinearLayout，布局方向为垂直方向。
所以你可以把它当成垂直布局的LinearLayout来使用。
AppBarLayout是在LinearLayou上加了一些材料设计的概念，
支持响应滚动手势的app bar布局（比如工具栏滚出或滚入屏幕），
CollapsingToolbarLayout则是专门用来实现子布局内不同元素响应滚动细节的布局。

把容器类的组件全部作为AppBar。

### Tips

设置setSupportActionBar后，可能无法显示出菜单

AppBarLayout必须是CoordinatorLayout的直接子View
