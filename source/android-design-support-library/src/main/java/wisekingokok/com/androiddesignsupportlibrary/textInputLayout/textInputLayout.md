### 定义

一个布局包裹了EditText（或者EditText的子类），在用户输入文本的时候显示一个浮动的提示标签。

### 基础语法

    android:hint 设置提示信息

    app:hintAnimationEnabled="true" 设置是否可以使用动画，默认是true

    app:hintEnabled="true" 设置是否可以使用hint属性，默认是true

    app:hintTextAppearance="@style/MyStyle" 设置hint的文本属性，改变hint文字的大小颜色等属性

    app:counterEnabled="true" 设置是否可以开启计数器，默认是false

    app:counterOverflowTextAppearance="@style/MyStyle2" 设置计算器越位后的文字颜色和大小

    app:counterTextAppearance="@style/MyStyle" 设置正常情况下的计数器文字颜色和大小

    app:counterMaxLength="11" 设置计算器的最大字数限制

    app:errorEnabled="true" 是否允许错误提示

    app:errorTextAppearance="@style/MyStyle2" 错误提示的文字大小和颜色

    app:passwordToggleEnabled="true" 控制密码可见开关是否启用。**设为false则该功能不启用，密码输入框右侧也没有控制密码可见与否的开关

    app:passwordToggleDrawable="@drawable/eye" 设置密码可见开关的图标。通常我们会在不同的情况下设定不同的图标，可通过自定义一个selector，根据‘state_checked’属性来控制图标的切换

    app:passwordToggleTint 控制密码可见开关图标的颜色。在开启或关闭的状态下我们可以设定不同的颜色，可通过自定义一个color的selector，根据state_checked和state_selected属性来控制颜色的切换

    app:passwordToggleTintMode 控制密码可见开关图标的背景颜色混合模式

    app:passwordToggleContentDescription 该功能是为Talkback或其他无障碍功能提供的。TalkBack会去读contentDescription的值，告诉用户这个操作是什么

### Material Design设计规范
