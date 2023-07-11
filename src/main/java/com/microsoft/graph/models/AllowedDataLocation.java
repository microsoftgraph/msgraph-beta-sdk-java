package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AllowedDataLocation extends Entity implements Parsable {
    /**
     * The appId property
     */
    private String appId;
    /**
     * The domain property
     */
    private String domain;
    /**
     * The isDefault property
     */
    private Boolean isDefault;
    /**
     * The location property
     */
    private String location;
    /**
     * Instantiates a new allowedDataLocation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AllowedDataLocation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a allowedDataLocation
     */
    @javax.annotation.Nonnull
    public static AllowedDataLocation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AllowedDataLocation();
    }
    /**
     * Gets the appId property value. The appId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * Gets the domain property value. The domain property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomain() {
        return this.domain;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("domain", (n) -> { this.setDomain(n.getStringValue()); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDefault property value. The isDefault property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    /**
     * Gets the location property value. The location property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocation() {
        return this.location;
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
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("domain", this.getDomain());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeStringValue("location", this.getLocation());
    }
    /**
     * Sets the appId property value. The appId property
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the domain property value. The domain property
     * @param value Value to set for the domain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomain(@javax.annotation.Nullable final String value) {
        this.domain = value;
    }
    /**
     * Sets the isDefault property value. The isDefault property
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this.isDefault = value;
    }
    /**
     * Sets the location property value. The location property
     * @param value Value to set for the location property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocation(@javax.annotation.Nullable final String value) {
        this.location = value;
    }
}
