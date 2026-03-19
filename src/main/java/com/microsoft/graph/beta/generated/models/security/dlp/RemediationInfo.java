package com.microsoft.graph.beta.models.security.dlp;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RemediationInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RemediationInfo} and sets the default values.
     */
    public RemediationInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RemediationInfo}
     */
    @jakarta.annotation.Nonnull
    public static RemediationInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemediationInfo();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the alertId property value. The alertId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlertId() {
        return this.backingStore.get("alertId");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the bccRecipients property value. The bccRecipients property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBccRecipients() {
        return this.backingStore.get("bccRecipients");
    }
    /**
     * Gets the ccRecipients property value. The ccRecipients property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCcRecipients() {
        return this.backingStore.get("ccRecipients");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("alertId", (n) -> { this.setAlertId(n.getStringValue()); });
        deserializerMap.put("bccRecipients", (n) -> { this.setBccRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("ccRecipients", (n) -> { this.setCcRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("iwUser", (n) -> { this.setIwUser(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recipients", (n) -> { this.setRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("remediationActivity", (n) -> { this.setRemediationActivity(n.getEnumValue(RemediationActivityType::forValue)); });
        deserializerMap.put("sender", (n) -> { this.setSender(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("templateName", (n) -> { this.setTemplateName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the iwUser property value. The iwUser property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIwUser() {
        return this.backingStore.get("iwUser");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the recipients property value. The recipients property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRecipients() {
        return this.backingStore.get("recipients");
    }
    /**
     * Gets the remediationActivity property value. The remediationActivity property
     * @return a {@link RemediationActivityType}
     */
    @jakarta.annotation.Nullable
    public RemediationActivityType getRemediationActivity() {
        return this.backingStore.get("remediationActivity");
    }
    /**
     * Gets the sender property value. The sender property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSender() {
        return this.backingStore.get("sender");
    }
    /**
     * Gets the subject property value. The subject property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Gets the templateName property value. The templateName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTemplateName() {
        return this.backingStore.get("templateName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alertId", this.getAlertId());
        writer.writeCollectionOfPrimitiveValues("bccRecipients", this.getBccRecipients());
        writer.writeCollectionOfPrimitiveValues("ccRecipients", this.getCcRecipients());
        writer.writeStringValue("iwUser", this.getIwUser());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("recipients", this.getRecipients());
        writer.writeEnumValue("remediationActivity", this.getRemediationActivity());
        writer.writeStringValue("sender", this.getSender());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeStringValue("templateName", this.getTemplateName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the alertId property value. The alertId property
     * @param value Value to set for the alertId property.
     */
    public void setAlertId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("alertId", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the bccRecipients property value. The bccRecipients property
     * @param value Value to set for the bccRecipients property.
     */
    public void setBccRecipients(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("bccRecipients", value);
    }
    /**
     * Sets the ccRecipients property value. The ccRecipients property
     * @param value Value to set for the ccRecipients property.
     */
    public void setCcRecipients(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ccRecipients", value);
    }
    /**
     * Sets the iwUser property value. The iwUser property
     * @param value Value to set for the iwUser property.
     */
    public void setIwUser(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("iwUser", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the recipients property value. The recipients property
     * @param value Value to set for the recipients property.
     */
    public void setRecipients(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("recipients", value);
    }
    /**
     * Sets the remediationActivity property value. The remediationActivity property
     * @param value Value to set for the remediationActivity property.
     */
    public void setRemediationActivity(@jakarta.annotation.Nullable final RemediationActivityType value) {
        this.backingStore.set("remediationActivity", value);
    }
    /**
     * Sets the sender property value. The sender property
     * @param value Value to set for the sender property.
     */
    public void setSender(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sender", value);
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subject", value);
    }
    /**
     * Sets the templateName property value. The templateName property
     * @param value Value to set for the templateName property.
     */
    public void setTemplateName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("templateName", value);
    }
}
