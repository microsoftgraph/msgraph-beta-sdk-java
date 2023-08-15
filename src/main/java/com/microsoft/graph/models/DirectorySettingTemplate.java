package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DirectorySettingTemplate extends DirectoryObject implements Parsable {
    /**
     * Description of the template. Read-only.
     */
    private String description;
    /**
     * Display name of the template. Read-only.
     */
    private String displayName;
    /**
     * Collection of settingTemplateValues that list the set of available settings, defaults and types that make up this template.  Read-only.
     */
    private java.util.List<SettingTemplateValue> values;
    /**
     * Instantiates a new directorySettingTemplate and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DirectorySettingTemplate() {
        super();
        this.setOdataType("#microsoft.graph.directorySettingTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a directorySettingTemplate
     */
    @jakarta.annotation.Nonnull
    public static DirectorySettingTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectorySettingTemplate();
    }
    /**
     * Gets the description property value. Description of the template. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Display name of the template. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfObjectValues(SettingTemplateValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the values property value. Collection of settingTemplateValues that list the set of available settings, defaults and types that make up this template.  Read-only.
     * @return a settingTemplateValue
     */
    @jakarta.annotation.Nullable
    public java.util.List<SettingTemplateValue> getValues() {
        return this.values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("values", this.getValues());
    }
    /**
     * Sets the description property value. Description of the template. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Display name of the template. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the values property value. Collection of settingTemplateValues that list the set of available settings, defaults and types that make up this template.  Read-only.
     * @param value Value to set for the values property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setValues(@jakarta.annotation.Nullable final java.util.List<SettingTemplateValue> value) {
        this.values = value;
    }
}
