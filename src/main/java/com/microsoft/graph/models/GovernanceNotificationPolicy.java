package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GovernanceNotificationPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The enabledTemplateTypes property
     */
    private java.util.List<String> enabledTemplateTypes;
    /**
     * The notificationTemplates property
     */
    private java.util.List<GovernanceNotificationTemplate> notificationTemplates;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new governanceNotificationPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GovernanceNotificationPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a governanceNotificationPolicy
     */
    @javax.annotation.Nonnull
    public static GovernanceNotificationPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceNotificationPolicy();
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
     * Gets the enabledTemplateTypes property value. The enabledTemplateTypes property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEnabledTemplateTypes() {
        return this.enabledTemplateTypes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("enabledTemplateTypes", (n) -> { this.setEnabledTemplateTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("notificationTemplates", (n) -> { this.setNotificationTemplates(n.getCollectionOfObjectValues(GovernanceNotificationTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notificationTemplates property value. The notificationTemplates property
     * @return a governanceNotificationTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceNotificationTemplate> getNotificationTemplates() {
        return this.notificationTemplates;
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
        writer.writeCollectionOfPrimitiveValues("enabledTemplateTypes", this.getEnabledTemplateTypes());
        writer.writeCollectionOfObjectValues("notificationTemplates", this.getNotificationTemplates());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the enabledTemplateTypes property value. The enabledTemplateTypes property
     * @param value Value to set for the enabledTemplateTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabledTemplateTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this.enabledTemplateTypes = value;
    }
    /**
     * Sets the notificationTemplates property value. The notificationTemplates property
     * @param value Value to set for the notificationTemplates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationTemplates(@javax.annotation.Nullable final java.util.List<GovernanceNotificationTemplate> value) {
        this.notificationTemplates = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
