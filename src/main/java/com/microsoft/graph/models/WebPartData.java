package com.microsoft.graph.models;

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
public class WebPartData implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new WebPartData and sets the default values.
     */
    public WebPartData() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WebPartData
     */
    @jakarta.annotation.Nonnull
    public static WebPartData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebPartData();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the audiences property value. Audience information of the web part. By using this property, specific content is prioritized to specific audiences.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAudiences() {
        return this.BackingStore.get("audiences");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the dataVersion property value. Data version of the web part. The value is defined by the web part developer. Different dataVersions usually refers to a different property structure.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDataVersion() {
        return this.BackingStore.get("dataVersion");
    }
    /**
     * Gets the description property value. Description of the web part.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("audiences", (n) -> { this.setAudiences(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("dataVersion", (n) -> { this.setDataVersion(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("properties", (n) -> { this.setProperties(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("serverProcessedContent", (n) -> { this.setServerProcessedContent(n.getObjectValue(ServerProcessedContent::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the properties property value. Properties bag of the web part.
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getProperties() {
        return this.BackingStore.get("properties");
    }
    /**
     * Gets the serverProcessedContent property value. Contains collections of data that can be processed by server side services like search index and link fixup.
     * @return a ServerProcessedContent
     */
    @jakarta.annotation.Nullable
    public ServerProcessedContent getServerProcessedContent() {
        return this.BackingStore.get("serverProcessedContent");
    }
    /**
     * Gets the title property value. Title of the web part.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.BackingStore.get("title");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("audiences", this.getAudiences());
        writer.writeStringValue("dataVersion", this.getDataVersion());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("properties", this.getProperties());
        writer.writeObjectValue("serverProcessedContent", this.getServerProcessedContent());
        writer.writeStringValue("title", this.getTitle());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the audiences property value. Audience information of the web part. By using this property, specific content is prioritized to specific audiences.
     * @param value Value to set for the audiences property.
     */
    public void setAudiences(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("audiences", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the dataVersion property value. Data version of the web part. The value is defined by the web part developer. Different dataVersions usually refers to a different property structure.
     * @param value Value to set for the dataVersion property.
     */
    public void setDataVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("dataVersion", value);
    }
    /**
     * Sets the description property value. Description of the web part.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the properties property value. Properties bag of the web part.
     * @param value Value to set for the properties property.
     */
    public void setProperties(@jakarta.annotation.Nullable final Json value) {
        this.BackingStore.set("properties", value);
    }
    /**
     * Sets the serverProcessedContent property value. Contains collections of data that can be processed by server side services like search index and link fixup.
     * @param value Value to set for the serverProcessedContent property.
     */
    public void setServerProcessedContent(@jakarta.annotation.Nullable final ServerProcessedContent value) {
        this.BackingStore.set("serverProcessedContent", value);
    }
    /**
     * Sets the title property value. Title of the web part.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("title", value);
    }
}
