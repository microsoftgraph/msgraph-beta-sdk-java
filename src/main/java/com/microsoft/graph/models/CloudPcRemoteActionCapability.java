package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcRemoteActionCapability implements AdditionalDataHolder, Parsable {
    /**
     * Indicates the state of the supported action capability to perform a Cloud PC remote action. Possible values are: enabled, disabled. Default value is enabled.
     */
    private ActionCapability actionCapability;
    /**
     * The name of the supported Cloud PC remote action. Possible values are: unknown, restart, rename, restore, resize, reprovision, troubleShoot, changeUserAccountType, placeUnderReview. Default value is unknown.
     */
    private CloudPcRemoteActionName actionName;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new cloudPcRemoteActionCapability and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcRemoteActionCapability() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcRemoteActionCapability
     */
    @javax.annotation.Nonnull
    public static CloudPcRemoteActionCapability createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcRemoteActionCapability();
    }
    /**
     * Gets the actionCapability property value. Indicates the state of the supported action capability to perform a Cloud PC remote action. Possible values are: enabled, disabled. Default value is enabled.
     * @return a actionCapability
     */
    @javax.annotation.Nullable
    public ActionCapability getActionCapability() {
        return this.actionCapability;
    }
    /**
     * Gets the actionName property value. The name of the supported Cloud PC remote action. Possible values are: unknown, restart, rename, restore, resize, reprovision, troubleShoot, changeUserAccountType, placeUnderReview. Default value is unknown.
     * @return a cloudPcRemoteActionName
     */
    @javax.annotation.Nullable
    public CloudPcRemoteActionName getActionName() {
        return this.actionName;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("actionCapability", (n) -> { this.setActionCapability(n.getEnumValue(ActionCapability.class)); });
        deserializerMap.put("actionName", (n) -> { this.setActionName(n.getEnumValue(CloudPcRemoteActionName.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeEnumValue("actionCapability", this.getActionCapability());
        writer.writeEnumValue("actionName", this.getActionName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionCapability property value. Indicates the state of the supported action capability to perform a Cloud PC remote action. Possible values are: enabled, disabled. Default value is enabled.
     * @param value Value to set for the actionCapability property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionCapability(@javax.annotation.Nullable final ActionCapability value) {
        this.actionCapability = value;
    }
    /**
     * Sets the actionName property value. The name of the supported Cloud PC remote action. Possible values are: unknown, restart, rename, restore, resize, reprovision, troubleShoot, changeUserAccountType, placeUnderReview. Default value is unknown.
     * @param value Value to set for the actionName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionName(@javax.annotation.Nullable final CloudPcRemoteActionName value) {
        this.actionName = value;
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
