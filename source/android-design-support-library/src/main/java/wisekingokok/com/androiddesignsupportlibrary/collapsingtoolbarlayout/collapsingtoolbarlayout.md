### 定义

CollapsingToolbarLayout提供了一个可以折叠的Toolbar
继承至FrameLayout，它设置layout_scrollFlags后，
可以控制包含在CollapsingToolbarLayout中的控件
在响应layout_behavior事件时作出相应的scrollFlags滚动事件。

### 使用方法

    scroll - 想滚动就必须设置这个。
    enterAlways - 实现quick return效果, 当向下移动时，立即显示View（比如Toolbar)。
    exitUntilCollapsed - 向上滚动时收缩View，但可以固定Toolbar一直在上面。
    enterAlwaysCollapsed - 当你的View已经设置minHeight属性又使用此标志时，你的View只能以最小高度进入，只有当滚动视图到达顶部时才扩大到完整高度。
    contentScrim - 设置当完全CollapsingToolbarLayout折叠(收缩)后的背景颜色。
    expandedTitleMarginStart - 设置扩张时候(还没有收缩时)title向左填充的距离。

layout_collapseMode (折叠模式) - 有两个值:

    pin -  设置为这个模式时，当CollapsingToolbarLayout完全收缩后，Toolbar还可以保留在屏幕上。
    parallax - 设置为这个模式时，在内容滚动时，CollapsingToolbarLayout中的View（比如ImageView)也可以同时滚动，实现视差滚动效果，通常和layout_collapseParallaxMultiplier(设置视差因子)搭配使用。

layout_collapseParallaxMultiplier(视差因子) - 设置视差滚动因子，值为：0~1。

### Tips

使用CollapsingToolbarLayout时必须把title设置到CollapsingToolbarLayout上，设置到Toolbar上不会显示。
Toolbar 的高度layout_height必须明确指定，不能 “wrap_content”，否则Toolbar不会滑动，也没有折叠效果
需要嵌套在Toolbar内使用

CollapsingToolbarLayout和ScrollView一起使用会有滑动bug，注意要使用NestedScrollView来替代ScrollView。

