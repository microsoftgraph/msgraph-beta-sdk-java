package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DetectionAction implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The alertTemplate property
     */
    private AlertTemplate alertTemplate;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The organizationalScope property
     */
    private OrganizationalScope organizationalScope;
    /**
     * The responseActions property
     */
    private java.util.List<ResponseAction> responseActions;
    /**
     * Instantiates a new detectionAction and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DetectionAction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a detectionAction
     */
    @javax.annotation.Nonnull
    public static DetectionAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DetectionAction();
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
     * Gets the alertTemplate property value. The alertTemplate property
     * @return a alertTemplate
     */
    @javax.annotation.Nullable
    public AlertTemplate getAlertTemplate() {
        return this.alertTemplate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("alertTemplate", (n) -> { this.setAlertTemplate(n.getObjectValue(AlertTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("organizationalScope", (n) -> { this.setOrganizationalScope(n.getObjectValue(OrganizationalScope::createFromDiscriminatorValue)); });
        deserializerMap.put("responseActions", (n) -> { this.setResponseActions(n.getCollectionOfObjectValues(ResponseAction::createFromDiscriminatorValue)); });
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
     * Gets the organizationalScope property value. The organizationalScope property
     * @return a organizationalScope
     */
    @javax.annotation.Nullable
    public OrganizationalScope getOrganizationalScope() {
        return this.organizationalScope;
    }
    /**
     * Gets the responseActions property value. The responseActions property
     * @return a responseAction
     */
    @javax.annotation.Nullable
    public java.util.List<ResponseAction> getResponseActions() {
        return this.responseActions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("alertTemplate", this.getAlertTemplate());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("organizationalScope", this.getOrganizationalScope());
        writer.writeCollectionOfObjectValues("responseActions", this.getResponseActions());
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
     * Sets the alertTemplate property value. The alertTemplate property
     * @param value Value to set for the alertTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertTemplate(@javax.annotation.Nullable final AlertTemplate value) {
        this.alertTemplate = value;
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
     * Sets the organizationalScope property value. The organizationalScope property
     * @param value Value to set for the organizationalScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationalScope(@javax.annotation.Nullable final OrganizationalScope value) {
        this.organizationalScope = value;
    }
    /**
     * Sets the responseActions property value. The responseActions property
     * @param value Value to set for the responseActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResponseActions(@javax.annotation.Nullable final java.util.List<ResponseAction> value) {
        this.responseActions = value;
    }
}
