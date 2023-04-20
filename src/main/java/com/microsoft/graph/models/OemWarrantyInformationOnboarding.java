package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OemWarrantyInformationOnboarding extends Entity implements Parsable {
    /** Specifies whether warranty API is available. This property is read-only. */
    private Boolean available;
    /** Specifies whether warranty query is enabled for given OEM. This property is read-only. */
    private Boolean enabled;
    /** OEM name. This property is read-only. */
    private String oemName;
    /**
     * Instantiates a new OemWarrantyInformationOnboarding and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OemWarrantyInformationOnboarding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OemWarrantyInformationOnboarding
     */
    @javax.annotation.Nonnull
    public static OemWarrantyInformationOnboarding createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OemWarrantyInformationOnboarding();
    }
    /**
     * Gets the available property value. Specifies whether warranty API is available. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAvailable() {
        return this.available;
    }
    /**
     * Gets the enabled property value. Specifies whether warranty query is enabled for given OEM. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("available", (n) -> { this.setAvailable(n.getBooleanValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("oemName", (n) -> { this.setOemName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the oemName property value. OEM name. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOemName() {
        return this.oemName;
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
    }
    /**
     * Sets the available property value. Specifies whether warranty API is available. This property is read-only.
     * @param value Value to set for the available property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailable(@javax.annotation.Nullable final Boolean value) {
        this.available = value;
    }
    /**
     * Sets the enabled property value. Specifies whether warranty query is enabled for given OEM. This property is read-only.
     * @param value Value to set for the enabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the oemName property value. OEM name. This property is read-only.
     * @param value Value to set for the oemName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOemName(@javax.annotation.Nullable final String value) {
        this.oemName = value;
    }
}
