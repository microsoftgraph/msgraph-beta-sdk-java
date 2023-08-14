package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Configuration Manager client information synced from SCCM
 */
public class ConfigurationManagerClientInformation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Configuration Manager Client Id from SCCM
     */
    private String clientIdentifier;
    /**
     * Configuration Manager Client version from SCCM
     */
    private String clientVersion;
    /**
     * Configuration Manager Client blocked status from SCCM
     */
    private Boolean isBlocked;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new configurationManagerClientInformation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConfigurationManagerClientInformation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a configurationManagerClientInformation
     */
    @javax.annotation.Nonnull
    public static ConfigurationManagerClientInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationManagerClientInformation();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the clientIdentifier property value. Configuration Manager Client Id from SCCM
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientIdentifier() {
        return this.clientIdentifier;
    }
    /**
     * Gets the clientVersion property value. Configuration Manager Client version from SCCM
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientVersion() {
        return this.clientVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("clientIdentifier", (n) -> { this.setClientIdentifier(n.getStringValue()); });
        deserializerMap.put("clientVersion", (n) -> { this.setClientVersion(n.getStringValue()); });
        deserializerMap.put("isBlocked", (n) -> { this.setIsBlocked(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isBlocked property value. Configuration Manager Client blocked status from SCCM
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBlocked() {
        return this.isBlocked;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("clientIdentifier", this.getClientIdentifier());
        writer.writeStringValue("clientVersion", this.getClientVersion());
        writer.writeBooleanValue("isBlocked", this.getIsBlocked());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the clientIdentifier property value. Configuration Manager Client Id from SCCM
     * @param value Value to set for the clientIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientIdentifier(@javax.annotation.Nullable final String value) {
        this.clientIdentifier = value;
    }
    /**
     * Sets the clientVersion property value. Configuration Manager Client version from SCCM
     * @param value Value to set for the clientVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientVersion(@javax.annotation.Nullable final String value) {
        this.clientVersion = value;
    }
    /**
     * Sets the isBlocked property value. Configuration Manager Client blocked status from SCCM
     * @param value Value to set for the isBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsBlocked(@javax.annotation.Nullable final Boolean value) {
        this.isBlocked = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
