package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an ADMX dropdownList element and an ADMX enum element.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyPresentationDropdownList extends GroupPolicyUploadedPresentation implements Parsable {
    /**
     * Instantiates a new {@link GroupPolicyPresentationDropdownList} and sets the default values.
     */
    public GroupPolicyPresentationDropdownList() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyPresentationDropdownList");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GroupPolicyPresentationDropdownList}
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyPresentationDropdownList createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationDropdownList();
    }
    /**
     * Gets the defaultItem property value. Localized string value identifying the default choice of the list of items.
     * @return a {@link GroupPolicyPresentationDropdownListItem}
     */
    @jakarta.annotation.Nullable
    public GroupPolicyPresentationDropdownListItem getDefaultItem() {
        return this.backingStore.get("defaultItem");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultItem", (n) -> { this.setDefaultItem(n.getObjectValue(GroupPolicyPresentationDropdownListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(GroupPolicyPresentationDropdownListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("required", (n) -> { this.setRequired(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the items property value. Represents a set of localized display names and their associated values.
     * @return a {@link java.util.List<GroupPolicyPresentationDropdownListItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyPresentationDropdownListItem> getItems() {
        return this.backingStore.get("items");
    }
    /**
     * Gets the required property value. Requirement to enter a value in the parameter box. The default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequired() {
        return this.backingStore.get("required");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("defaultItem", this.getDefaultItem());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeBooleanValue("required", this.getRequired());
    }
    /**
     * Sets the defaultItem property value. Localized string value identifying the default choice of the list of items.
     * @param value Value to set for the defaultItem property.
     */
    public void setDefaultItem(@jakarta.annotation.Nullable final GroupPolicyPresentationDropdownListItem value) {
        this.backingStore.set("defaultItem", value);
    }
    /**
     * Sets the items property value. Represents a set of localized display names and their associated values.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<GroupPolicyPresentationDropdownListItem> value) {
        this.backingStore.set("items", value);
    }
    /**
     * Sets the required property value. Requirement to enter a value in the parameter box. The default value is false.
     * @param value Value to set for the required property.
     */
    public void setRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("required", value);
    }
}
