package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Specify access control level per privacy data category
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsPrivacyDataAccessControlItem extends Entity implements Parsable {
    /**
     * Instantiates a new WindowsPrivacyDataAccessControlItem and sets the default values.
     */
    public WindowsPrivacyDataAccessControlItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsPrivacyDataAccessControlItem
     */
    @jakarta.annotation.Nonnull
    public static WindowsPrivacyDataAccessControlItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPrivacyDataAccessControlItem();
    }
    /**
     * Gets the accessLevel property value. Determine the access level to specific Windows privacy data category.
     * @return a WindowsPrivacyDataAccessLevel
     */
    @jakarta.annotation.Nullable
    public WindowsPrivacyDataAccessLevel getAccessLevel() {
        return this.backingStore.get("accessLevel");
    }
    /**
     * Gets the appDisplayName property value. The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.backingStore.get("appDisplayName");
    }
    /**
     * Gets the appPackageFamilyName property value. The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppPackageFamilyName() {
        return this.backingStore.get("appPackageFamilyName");
    }
    /**
     * Gets the dataCategory property value. Windows privacy data category specifier for privacy data access.
     * @return a WindowsPrivacyDataCategory
     */
    @jakarta.annotation.Nullable
    public WindowsPrivacyDataCategory getDataCategory() {
        return this.backingStore.get("dataCategory");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessLevel", (n) -> { this.setAccessLevel(n.getEnumValue(WindowsPrivacyDataAccessLevel::forValue)); });
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appPackageFamilyName", (n) -> { this.setAppPackageFamilyName(n.getStringValue()); });
        deserializerMap.put("dataCategory", (n) -> { this.setDataCategory(n.getEnumValue(WindowsPrivacyDataCategory::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("accessLevel", this.getAccessLevel());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appPackageFamilyName", this.getAppPackageFamilyName());
        writer.writeEnumValue("dataCategory", this.getDataCategory());
    }
    /**
     * Sets the accessLevel property value. Determine the access level to specific Windows privacy data category.
     * @param value Value to set for the accessLevel property.
     */
    public void setAccessLevel(@jakarta.annotation.Nullable final WindowsPrivacyDataAccessLevel value) {
        this.backingStore.set("accessLevel", value);
    }
    /**
     * Sets the appDisplayName property value. The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     * @param value Value to set for the appDisplayName property.
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appDisplayName", value);
    }
    /**
     * Sets the appPackageFamilyName property value. The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     * @param value Value to set for the appPackageFamilyName property.
     */
    public void setAppPackageFamilyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appPackageFamilyName", value);
    }
    /**
     * Sets the dataCategory property value. Windows privacy data category specifier for privacy data access.
     * @param value Value to set for the dataCategory property.
     */
    public void setDataCategory(@jakarta.annotation.Nullable final WindowsPrivacyDataCategory value) {
        this.backingStore.set("dataCategory", value);
    }
}
