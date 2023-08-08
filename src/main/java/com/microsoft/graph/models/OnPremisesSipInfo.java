package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesSipInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The isSipEnabled property
     */
    private Boolean isSipEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The sipDeploymentLocation property
     */
    private String sipDeploymentLocation;
    /**
     * The sipPrimaryAddress property
     */
    private String sipPrimaryAddress;
    /**
     * Instantiates a new onPremisesSipInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesSipInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesSipInfo
     */
    @javax.annotation.Nonnull
    public static OnPremisesSipInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesSipInfo();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isSipEnabled", (n) -> { this.setIsSipEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sipDeploymentLocation", (n) -> { this.setSipDeploymentLocation(n.getStringValue()); });
        deserializerMap.put("sipPrimaryAddress", (n) -> { this.setSipPrimaryAddress(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isSipEnabled property value. The isSipEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSipEnabled() {
        return this.isSipEnabled;
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
     * Gets the sipDeploymentLocation property value. The sipDeploymentLocation property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSipDeploymentLocation() {
        return this.sipDeploymentLocation;
    }
    /**
     * Gets the sipPrimaryAddress property value. The sipPrimaryAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSipPrimaryAddress() {
        return this.sipPrimaryAddress;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isSipEnabled", this.getIsSipEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sipDeploymentLocation", this.getSipDeploymentLocation());
        writer.writeStringValue("sipPrimaryAddress", this.getSipPrimaryAddress());
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
     * Sets the isSipEnabled property value. The isSipEnabled property
     * @param value Value to set for the isSipEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSipEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isSipEnabled = value;
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
    /**
     * Sets the sipDeploymentLocation property value. The sipDeploymentLocation property
     * @param value Value to set for the sipDeploymentLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSipDeploymentLocation(@javax.annotation.Nullable final String value) {
        this.sipDeploymentLocation = value;
    }
    /**
     * Sets the sipPrimaryAddress property value. The sipPrimaryAddress property
     * @param value Value to set for the sipPrimaryAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSipPrimaryAddress(@javax.annotation.Nullable final String value) {
        this.sipPrimaryAddress = value;
    }
}
