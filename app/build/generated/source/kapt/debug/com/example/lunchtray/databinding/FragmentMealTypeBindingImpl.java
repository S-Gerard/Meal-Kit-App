package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMealTypeBindingImpl extends FragmentMealTypeBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.meal_options, 8);
        sViewsWithIds.put(R.id.divider, 9);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMealTypeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentMealTypeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[6]
            , (android.view.View) bindings[9]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.RadioGroup) bindings[8]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.RadioButton) bindings[2]
            );
        this.cancelButton.setTag(null);
        this.glutenFree.setTag(null);
        this.healthy.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.meat.setTag(null);
        this.nextButton.setTag(null);
        this.total.setTag(null);
        this.vegan.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        mCallback6 = new com.example.lunchtray.generated.callback.OnClickListener(this, 6);
        mCallback3 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback4 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback1 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mealTypeFragment == variableId) {
            setMealTypeFragment((com.example.lunchtray.ui.order.MealTypeFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMealTypeFragment(@Nullable com.example.lunchtray.ui.order.MealTypeFragment MealTypeFragment) {
        this.mMealTypeFragment = MealTypeFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.mealTypeFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelTotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.lunchtray.ui.order.MealTypeFragment mealTypeFragment = mMealTypeFragment;
        java.lang.String totalAndroidStringTotalViewModelTotal = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelTotal = null;
        java.lang.String viewModelTotalGetValue = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.total
                    viewModelTotal = viewModel.getTotal();
                }
                updateLiveDataRegistration(0, viewModelTotal);


                if (viewModelTotal != null) {
                    // read viewModel.total.getValue()
                    viewModelTotalGetValue = viewModelTotal.getValue();
                }


                // read @android:string/total
                totalAndroidStringTotalViewModelTotal = total.getResources().getString(R.string.total, viewModelTotalGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback5);
            this.glutenFree.setOnClickListener(mCallback3);
            this.healthy.setOnClickListener(mCallback4);
            this.meat.setOnClickListener(mCallback1);
            this.nextButton.setOnClickListener(mCallback6);
            this.vegan.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.total, totalAndroidStringTotalViewModelTotal);
            this.total.setText(totalAndroidStringTotalViewModelTotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // mealTypeFragment != null
                boolean mealTypeFragmentJavaLangObjectNull = false;
                // mealTypeFragment
                com.example.lunchtray.ui.order.MealTypeFragment mealTypeFragment = mMealTypeFragment;



                mealTypeFragmentJavaLangObjectNull = (mealTypeFragment) != (null);
                if (mealTypeFragmentJavaLangObjectNull) {


                    mealTypeFragment.cancelOrder();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // mealTypeFragment != null
                boolean mealTypeFragmentJavaLangObjectNull = false;
                // mealTypeFragment
                com.example.lunchtray.ui.order.MealTypeFragment mealTypeFragment = mMealTypeFragment;



                mealTypeFragmentJavaLangObjectNull = (mealTypeFragment) != (null);
                if (mealTypeFragmentJavaLangObjectNull) {


                    mealTypeFragment.goToNextScreen();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setType("Gluten Free");
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setType("Healthy");
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setType("Meat");
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setType("Vegan");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.total
        flag 1 (0x2L): mealTypeFragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}