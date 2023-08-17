package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GovernancePolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The decisionMakerCriteria property
     */
    private java.util.List<GovernanceCriteria> decisionMakerCriteria;
    /**
     * The notificationPolicy property
     */
    private GovernanceNotificationPolicy notificationPolicy;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new governancePolicy and sets the default values.
     */
    public GovernancePolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a governancePolicy
     */
    @jakarta.annotation.Nonnull
    public static GovernancePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernancePolicy();
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
     * Gets the decisionMakerCriteria property value. The decisionMakerCriteria property
     * @return a governanceCriteria
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceCriteria> getDecisionMakerCriteria() {
        return this.decisionMakerCriteria;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("decisionMakerCriteria", (n) -> { this.setDecisionMakerCriteria(n.getCollectionOfObjectValues(GovernanceCriteria::createFromDiscriminatorValue)); });
        deserializerMap.put("notificationPolicy", (n) -> { this.setNotificationPolicy(n.getObjectValue(GovernanceNotificationPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notificationPolicy property value. The notificationPolicy property
     * @return a governanceNotificationPolicy
     */
    @jakarta.annotation.Nullable
    public GovernanceNotificationPolicy getNotificationPolicy() {
        return this.notificationPolicy;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("decisionMakerCriteria", this.getDecisionMakerCriteria());
        writer.writeObjectValue("notificationPolicy", this.getNotificationPolicy());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the decisionMakerCriteria property value. The decisionMakerCriteria property
     * @param value Value to set for the decisionMakerCriteria property.
     */
    public void setDecisionMakerCriteria(@jakarta.annotation.Nullable final java.util.List<GovernanceCriteria> value) {
        this.decisionMakerCriteria = value;
    }
    /**
     * Sets the notificationPolicy property value. The notificationPolicy property
     * @param value Value to set for the notificationPolicy property.
     */
    public void setNotificationPolicy(@jakarta.annotation.Nullable final GovernanceNotificationPolicy value) {
        this.notificationPolicy = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
