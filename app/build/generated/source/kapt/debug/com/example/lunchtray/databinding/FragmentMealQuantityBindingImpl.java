package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMealQuantityBindingImpl extends FragmentMealQuantityBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.quantity_options, 7);
        sViewsWithIds.put(R.id.one_meal_price, 8);
        sViewsWithIds.put(R.id.three_meals_price, 9);
        sViewsWithIds.put(R.id.five_meals_price, 10);
        sViewsWithIds.put(R.id.divider, 11);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMealQuantityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentMealQuantityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[5]
            , (android.view.View) bindings[11]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.TextView) bindings[10]
            , (android.widget.Button) bindings[6]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[8]
            , (android.widget.RadioGroup) bindings[7]
            , (android.widget.RadioButton) bindings[2]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[4]
            );
        this.cancelButton.setTag(null);
        this.fiveMeals.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.oneMeal.setTag(null);
        this.threeMeals.setTag(null);
        this.total.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback11 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        mCallback9 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback7 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback8 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else if (BR.mealQuantityFragment == variableId) {
            setMealQuantityFragment((com.example.lunchtray.ui.order.MealQuantityFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public void setMealQuantityFragment(@Nullable com.example.lunchtray.ui.order.MealQuantityFragment MealQuantityFragment) {
        this.mMealQuantityFragment = MealQuantityFragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.mealQuantityFragment);
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
        java.lang.String totalAndroidStringTotalViewModelTotal = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelTotal = null;
        java.lang.String viewModelTotalGetValue = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
        com.example.lunchtray.ui.order.MealQuantityFragment mealQuantityFragment = mMealQuantityFragment;

        if ((dirtyFlags & 0xbL) != 0) {



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

            this.cancelButton.setOnClickListener(mCallback10);
            this.fiveMeals.setOnClickListener(mCallback9);
            this.nextButton.setOnClickListener(mCallback11);
            this.oneMeal.setOnClickListener(mCallback7);
            this.threeMeals.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.total, totalAndroidStringTotalViewModelTotal);
            this.total.setText(totalAndroidStringTotalViewModelTotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // mealQuantityFragment != null
                boolean mealQuantityFragmentJavaLangObjectNull = false;
                // mealQuantityFragment
                com.example.lunchtray.ui.order.MealQuantityFragment mealQuantityFragment = mMealQuantityFragment;



                mealQuantityFragmentJavaLangObjectNull = (mealQuantityFragment) != (null);
                if (mealQuantityFragmentJavaLangObjectNull) {


                    mealQuantityFragment.cancelOrder();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // mealQuantityFragment != null
                boolean mealQuantityFragmentJavaLangObjectNull = false;
                // mealQuantityFragment
                com.example.lunchtray.ui.order.MealQuantityFragment mealQuantityFragment = mMealQuantityFragment;



                mealQuantityFragmentJavaLangObjectNull = (mealQuantityFragment) != (null);
                if (mealQuantityFragmentJavaLangObjectNull) {


                    mealQuantityFragment.goToNextScreen();
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



                    viewModel.setQuantity(5);
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



                    viewModel.setQuantity(1);
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



                    viewModel.setQuantity(3);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.total
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): mealQuantityFragment
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}