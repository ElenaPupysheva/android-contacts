package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T>{

    public boolean theSameAs(T t) {
        return this.hashCode() == t.hashCode();
    }

    @Override
    public boolean areItemsTheSame(@NonNull T t, @NonNull T t1) {
        return false;
    }

    @Override
    public boolean areContentsTheSame(@NonNull T t, @NonNull T t1) {
        return false;
    }
}
