package com.example.lunchtray;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.lunchtray.databinding.FragmentCheckoutBindingImpl;
import com.example.lunchtray.databinding.FragmentMealQuantityBindingImpl;
import com.example.lunchtray.databinding.FragmentMealTypeBindingImpl;
import com.example.lunchtray.databinding.FragmentSubscriptionBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTCHECKOUT = 1;

  private static final int LAYOUT_FRAGMENTMEALQUANTITY = 2;

  private static final int LAYOUT_FRAGMENTMEALTYPE = 3;

  private static final int LAYOUT_FRAGMENTSUBSCRIPTION = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lunchtray.R.layout.fragment_checkout, LAYOUT_FRAGMENTCHECKOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lunchtray.R.layout.fragment_meal_quantity, LAYOUT_FRAGMENTMEALQUANTITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lunchtray.R.layout.fragment_meal_type, LAYOUT_FRAGMENTMEALTYPE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lunchtray.R.layout.fragment_subscription, LAYOUT_FRAGMENTSUBSCRIPTION);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTCHECKOUT: {
          if ("layout/fragment_checkout_0".equals(tag)) {
            return new FragmentCheckoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_checkout is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMEALQUANTITY: {
          if ("layout/fragment_meal_quantity_0".equals(tag)) {
            return new FragmentMealQuantityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_meal_quantity is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMEALTYPE: {
          if ("layout/fragment_meal_type_0".equals(tag)) {
            return new FragmentMealTypeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_meal_type is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSUBSCRIPTION: {
          if ("layout/fragment_subscription_0".equals(tag)) {
            return new FragmentSubscriptionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_subscription is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "checkoutFragment");
      sKeys.put(2, "mealQuantityFragment");
      sKeys.put(3, "mealTypeFragment");
      sKeys.put(4, "subscriptionFragment");
      sKeys.put(5, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/fragment_checkout_0", com.example.lunchtray.R.layout.fragment_checkout);
      sKeys.put("layout/fragment_meal_quantity_0", com.example.lunchtray.R.layout.fragment_meal_quantity);
      sKeys.put("layout/fragment_meal_type_0", com.example.lunchtray.R.layout.fragment_meal_type);
      sKeys.put("layout/fragment_subscription_0", com.example.lunchtray.R.layout.fragment_subscription);
    }
  }
}
