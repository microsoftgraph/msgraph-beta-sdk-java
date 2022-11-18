package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupPolicyPresentationDropdownList extends GroupPolicyUploadedPresentation implements Parsable {
    /** Localized string value identifying the default choice of the list of items. */
    private GroupPolicyPresentationDropdownListItem _defaultItem;
    /** Represents a set of localized display names and their associated values. */
    private java.util.List<GroupPolicyPresentationDropdownListItem> _items;
    /** Requirement to enter a value in the parameter box. The default value is false. */
    private Boolean _required;
    /**
     * Instantiates a new GroupPolicyPresentationDropdownList and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupPolicyPresentationDropdownList() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyPresentationDropdownList");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyPresentationDropdownList
     */
    @javax.annotation.Nonnull
    public static GroupPolicyPresentationDropdownList createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationDropdownList();
    }
    /**
     * Gets the defaultItem property value. Localized string value identifying the default choice of the list of items.
     * @return a groupPolicyPresentationDropdownListItem
     */
    @javax.annotation.Nullable
    public GroupPolicyPresentationDropdownListItem getDefaultItem() {
        return this._defaultItem;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupPolicyPresentationDropdownList currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("defaultItem", (n) -> { currentObject.setDefaultItem(n.getObjectValue(GroupPolicyPresentationDropdownListItem::createFromDiscriminatorValue)); });
            this.put("items", (n) -> { currentObject.setItems(n.getCollectionOfObjectValues(GroupPolicyPresentationDropdownListItem::createFromDiscriminatorValue)); });
            this.put("required", (n) -> { currentObject.setRequired(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the items property value. Represents a set of localized display names and their associated values.
     * @return a groupPolicyPresentationDropdownListItem
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyPresentationDropdownListItem> getItems() {
        return this._items;
    }
    /**
     * Gets the required property value. Requirement to enter a value in the parameter box. The default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequired() {
        return this._required;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("defaultItem", this.getDefaultItem());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeBooleanValue("required", this.getRequired());
    }
    /**
     * Sets the defaultItem property value. Localized string value identifying the default choice of the list of items.
     * @param value Value to set for the defaultItem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultItem(@javax.annotation.Nullable final GroupPolicyPresentationDropdownListItem value) {
        this._defaultItem = value;
    }
    /**
     * Sets the items property value. Represents a set of localized display names and their associated values.
     * @param value Value to set for the items property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItems(@javax.annotation.Nullable final java.util.List<GroupPolicyPresentationDropdownListItem> value) {
        this._items = value;
    }
    /**
     * Sets the required property value. Requirement to enter a value in the parameter box. The default value is false.
     * @param value Value to set for the required property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequired(@javax.annotation.Nullable final Boolean value) {
        this._required = value;
    }
}
