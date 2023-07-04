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
public class WindowsPrivacyDataAccessControlItem extends Entity implements Parsable {
    /**
     * Determine the access level to specific Windows privacy data category.
     */
    private WindowsPrivacyDataAccessLevel accessLevel;
    /**
     * The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     */
    private String appDisplayName;
    /**
     * The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     */
    private String appPackageFamilyName;
    /**
     * Windows privacy data category specifier for privacy data access.
     */
    private WindowsPrivacyDataCategory dataCategory;
    /**
     * Instantiates a new windowsPrivacyDataAccessControlItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsPrivacyDataAccessControlItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsPrivacyDataAccessControlItem
     */
    @javax.annotation.Nonnull
    public static WindowsPrivacyDataAccessControlItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPrivacyDataAccessControlItem();
    }
    /**
     * Gets the accessLevel property value. Determine the access level to specific Windows privacy data category.
     * @return a WindowsPrivacyDataAccessLevel
     */
    @javax.annotation.Nullable
    public WindowsPrivacyDataAccessLevel getAccessLevel() {
        return this.accessLevel;
    }
    /**
     * Gets the appDisplayName property value. The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this.appDisplayName;
    }
    /**
     * Gets the appPackageFamilyName property value. The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppPackageFamilyName() {
        return this.appPackageFamilyName;
    }
    /**
     * Gets the dataCategory property value. Windows privacy data category specifier for privacy data access.
     * @return a WindowsPrivacyDataCategory
     */
    @javax.annotation.Nullable
    public WindowsPrivacyDataCategory getDataCategory() {
        return this.dataCategory;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessLevel", (n) -> { this.setAccessLevel(n.getEnumValue(WindowsPrivacyDataAccessLevel.class)); });
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appPackageFamilyName", (n) -> { this.setAppPackageFamilyName(n.getStringValue()); });
        deserializerMap.put("dataCategory", (n) -> { this.setDataCategory(n.getEnumValue(WindowsPrivacyDataCategory.class)); });
        return deserializerMap;
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
        writer.writeEnumValue("accessLevel", this.getAccessLevel());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appPackageFamilyName", this.getAppPackageFamilyName());
        writer.writeEnumValue("dataCategory", this.getDataCategory());
    }
    /**
     * Sets the accessLevel property value. Determine the access level to specific Windows privacy data category.
     * @param value Value to set for the accessLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessLevel(@javax.annotation.Nullable final WindowsPrivacyDataAccessLevel value) {
        this.accessLevel = value;
    }
    /**
     * Sets the appDisplayName property value. The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this.appDisplayName = value;
    }
    /**
     * Sets the appPackageFamilyName property value. The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     * @param value Value to set for the appPackageFamilyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppPackageFamilyName(@javax.annotation.Nullable final String value) {
        this.appPackageFamilyName = value;
    }
    /**
     * Sets the dataCategory property value. Windows privacy data category specifier for privacy data access.
     * @param value Value to set for the dataCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataCategory(@javax.annotation.Nullable final WindowsPrivacyDataCategory value) {
        this.dataCategory = value;
    }
}
