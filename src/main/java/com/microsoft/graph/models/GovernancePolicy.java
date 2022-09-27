package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GovernancePolicy implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The decisionMakerCriteria property */
    private java.util.List<GovernanceCriteria> _decisionMakerCriteria;
    /** The notificationPolicy property */
    private GovernanceNotificationPolicy _notificationPolicy;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new governancePolicy and sets the default values.
     * @return a void
     */
    public GovernancePolicy() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.governancePolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a governancePolicy
     */
    @javax.annotation.Nonnull
    public static GovernancePolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernancePolicy();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the decisionMakerCriteria property value. The decisionMakerCriteria property
     * @return a governanceCriteria
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceCriteria> getDecisionMakerCriteria() {
        return this._decisionMakerCriteria;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GovernancePolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("decisionMakerCriteria", (n) -> { currentObject.setDecisionMakerCriteria(n.getCollectionOfObjectValues(GovernanceCriteria::createFromDiscriminatorValue)); });
            this.put("notificationPolicy", (n) -> { currentObject.setNotificationPolicy(n.getObjectValue(GovernanceNotificationPolicy::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the notificationPolicy property value. The notificationPolicy property
     * @return a governanceNotificationPolicy
     */
    @javax.annotation.Nullable
    public GovernanceNotificationPolicy getNotificationPolicy() {
        return this._notificationPolicy;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("decisionMakerCriteria", this.getDecisionMakerCriteria());
        writer.writeObjectValue("notificationPolicy", this.getNotificationPolicy());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the decisionMakerCriteria property value. The decisionMakerCriteria property
     * @param value Value to set for the decisionMakerCriteria property.
     * @return a void
     */
    public void setDecisionMakerCriteria(@javax.annotation.Nullable final java.util.List<GovernanceCriteria> value) {
        this._decisionMakerCriteria = value;
    }
    /**
     * Sets the notificationPolicy property value. The notificationPolicy property
     * @param value Value to set for the notificationPolicy property.
     * @return a void
     */
    public void setNotificationPolicy(@javax.annotation.Nullable final GovernanceNotificationPolicy value) {
        this._notificationPolicy = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
