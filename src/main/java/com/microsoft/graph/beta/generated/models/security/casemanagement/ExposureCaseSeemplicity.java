package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExposureCaseSeemplicity implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ExposureCaseSeemplicity} and sets the default values.
     */
    public ExposureCaseSeemplicity() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExposureCaseSeemplicity}
     */
    @jakarta.annotation.Nonnull
    public static ExposureCaseSeemplicity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExposureCaseSeemplicity();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the configurationId property value. The configurationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConfigurationId() {
        return this.backingStore.get("configurationId");
    }
    /**
     * Gets the configurationName property value. The configurationName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConfigurationName() {
        return this.backingStore.get("configurationName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("configurationId", (n) -> { this.setConfigurationId(n.getStringValue()); });
        deserializerMap.put("configurationName", (n) -> { this.setConfigurationName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("providerType", (n) -> { this.setProviderType(n.getStringValue()); });
        deserializerMap.put("syncStatus", (n) -> { this.setSyncStatus(n.getStringValue()); });
        deserializerMap.put("ticketCreationTime", (n) -> { this.setTicketCreationTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ticketId", (n) -> { this.setTicketId(n.getStringValue()); });
        deserializerMap.put("ticketLink", (n) -> { this.setTicketLink(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the providerType property value. The providerType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderType() {
        return this.backingStore.get("providerType");
    }
    /**
     * Gets the syncStatus property value. The syncStatus property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSyncStatus() {
        return this.backingStore.get("syncStatus");
    }
    /**
     * Gets the ticketCreationTime property value. The ticketCreationTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTicketCreationTime() {
        return this.backingStore.get("ticketCreationTime");
    }
    /**
     * Gets the ticketId property value. The ticketId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTicketId() {
        return this.backingStore.get("ticketId");
    }
    /**
     * Gets the ticketLink property value. The ticketLink property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTicketLink() {
        return this.backingStore.get("ticketLink");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("configurationId", this.getConfigurationId());
        writer.writeStringValue("configurationName", this.getConfigurationName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("providerType", this.getProviderType());
        writer.writeStringValue("syncStatus", this.getSyncStatus());
        writer.writeOffsetDateTimeValue("ticketCreationTime", this.getTicketCreationTime());
        writer.writeStringValue("ticketId", this.getTicketId());
        writer.writeStringValue("ticketLink", this.getTicketLink());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the configurationId property value. The configurationId property
     * @param value Value to set for the configurationId property.
     */
    public void setConfigurationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("configurationId", value);
    }
    /**
     * Sets the configurationName property value. The configurationName property
     * @param value Value to set for the configurationName property.
     */
    public void setConfigurationName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("configurationName", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the providerType property value. The providerType property
     * @param value Value to set for the providerType property.
     */
    public void setProviderType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("providerType", value);
    }
    /**
     * Sets the syncStatus property value. The syncStatus property
     * @param value Value to set for the syncStatus property.
     */
    public void setSyncStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("syncStatus", value);
    }
    /**
     * Sets the ticketCreationTime property value. The ticketCreationTime property
     * @param value Value to set for the ticketCreationTime property.
     */
    public void setTicketCreationTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("ticketCreationTime", value);
    }
    /**
     * Sets the ticketId property value. The ticketId property
     * @param value Value to set for the ticketId property.
     */
    public void setTicketId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ticketId", value);
    }
    /**
     * Sets the ticketLink property value. The ticketLink property
     * @param value Value to set for the ticketLink property.
     */
    public void setTicketLink(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ticketLink", value);
    }
}
