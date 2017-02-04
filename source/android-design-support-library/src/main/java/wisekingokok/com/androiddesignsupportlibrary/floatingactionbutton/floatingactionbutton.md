### 定义

浮动操作按钮 (简称 FAB) 是: “一个特殊的promoted操作案例。因为一个浮动在UI之上的圆形图标而显得格外突出，同时它还具有特殊的手势行为”

### 基础语法

    app:backgroundTint - 设置FAB的背景颜色。

    app:rippleColor - 设置FAB点击时的背景颜色。

    app:borderWidth - 该属性尤为重要，如果不设置0dp，那么在4.1的sdk上FAB会显示为正方形，而且在5.0以后的sdk没有阴影效果。所以设置为borderWidth="0dp"。

    app:elevation - 默认状态下FAB的阴影大小。

    app:pressedTranslationZ - 点击时候FAB的阴影大小。

    app:fabSize - 设置FAB的大小，该属性有两个值，分别为normal和mini，对应的FAB大小分别为56dp和40dp。

    src - 设置FAB的图标，Google建议符合Design设计的该图标大小为24dp。

    app:layout_anchor - 设置FAB的锚点，即以哪个控件为参照点设置位置。

    app:layout_anchorGravity - 设置FAB相对锚点的位置，值有 bottom、center、right、left、top等。

### Material Design设计规范

『并不是每一个屏幕都需要浮动操作按钮』，接着说：『一个浮动操作按钮应该能够代表这个 App 中的主要操作，左边主要是相册集和打开的图片，并不需要浮动按钮，而在右侧，主要的动作是添加内容，所以添加浮动操作按钮是合理的。』

### Question

暂时不理解‘app:layout_anchor’和‘app:layout_anchorGravity’的使用方法