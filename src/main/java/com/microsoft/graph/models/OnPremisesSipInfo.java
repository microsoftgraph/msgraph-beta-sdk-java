package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnPremisesSipInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether the user is currently enabled for on-premises Skype for Business.
     */
    private Boolean isSipEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates a fully qualified DNS name of the Microsoft Online Communications Server deployment.
     */
    private String sipDeploymentLocation;
    /**
     * Serves as a unique identifier for each user on the on-premises Skype for Business.
     */
    private String sipPrimaryAddress;
    /**
     * Instantiates a new onPremisesSipInfo and sets the default values.
     */
    public OnPremisesSipInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesSipInfo
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesSipInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesSipInfo();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isSipEnabled", (n) -> { this.setIsSipEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sipDeploymentLocation", (n) -> { this.setSipDeploymentLocation(n.getStringValue()); });
        deserializerMap.put("sipPrimaryAddress", (n) -> { this.setSipPrimaryAddress(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isSipEnabled property value. Indicates whether the user is currently enabled for on-premises Skype for Business.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSipEnabled() {
        return this.isSipEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the sipDeploymentLocation property value. Indicates a fully qualified DNS name of the Microsoft Online Communications Server deployment.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSipDeploymentLocation() {
        return this.sipDeploymentLocation;
    }
    /**
     * Gets the sipPrimaryAddress property value. Serves as a unique identifier for each user on the on-premises Skype for Business.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSipPrimaryAddress() {
        return this.sipPrimaryAddress;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the isSipEnabled property value. Indicates whether the user is currently enabled for on-premises Skype for Business.
     * @param value Value to set for the isSipEnabled property.
     */
    public void setIsSipEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isSipEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sipDeploymentLocation property value. Indicates a fully qualified DNS name of the Microsoft Online Communications Server deployment.
     * @param value Value to set for the sipDeploymentLocation property.
     */
    public void setSipDeploymentLocation(@jakarta.annotation.Nullable final String value) {
        this.sipDeploymentLocation = value;
    }
    /**
     * Sets the sipPrimaryAddress property value. Serves as a unique identifier for each user on the on-premises Skype for Business.
     * @param value Value to set for the sipPrimaryAddress property.
     */
    public void setSipPrimaryAddress(@jakarta.annotation.Nullable final String value) {
        this.sipPrimaryAddress = value;
    }
}
