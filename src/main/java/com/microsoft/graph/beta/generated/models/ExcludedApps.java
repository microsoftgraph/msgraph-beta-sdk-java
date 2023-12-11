package com.microsoft.graph.beta.models;

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
/**
 * Contains properties for Excluded Office365 Apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExcludedApps implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ExcludedApps and sets the default values.
     */
    public ExcludedApps() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExcludedApps
     */
    @jakarta.annotation.Nonnull
    public static ExcludedApps createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExcludedApps();
    }
    /**
     * Gets the access property value. The value for if MS Office Access should be excluded or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAccess() {
        return this.backingStore.get("access");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the bing property value. The value for if Microsoft Search as default should be excluded or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBing() {
        return this.backingStore.get("bing");
    }
    /**
     * Gets the excel property value. The value for if MS Office Excel should be excluded or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getExcel() {
        return this.backingStore.get("excel");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(16);
        deserializerMap.put("access", (n) -> { this.setAccess(n.getBooleanValue()); });
        deserializerMap.put("bing", (n) -> { this.setBing(n.getBooleanValue()); });
        deserializerMap.put("excel", (n) -> { this.setExcel(n.getBooleanValue()); });
        deserializerMap.put("groove", (n) -> { this.setGroove(n.getBooleanValue()); });
        deserializerMap.put("infoPath", (n) -> { this.setInfoPath(n.getBooleanValue()); });
        deserializerMap.put("lync", (n) -> { this.setLync(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("oneDrive", (n) -> { this.setOneDrive(n.getBooleanValue()); });
        deserializerMap.put("oneNote", (n) -> { this.setOneNote(n.getBooleanValue()); });
        deserializerMap.put("outlook", (n) -> { this.setOutlook(n.getBooleanValue()); });
        deserializerMap.put("powerPoint", (n) -> { this.setPowerPoint(n.getBooleanValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getBooleanValue()); });
        deserializerMap.put("sharePointDesigner", (n) -> { this.setSharePointDesigner(n.getBooleanValue()); });
        deserializerMap.put("teams", (n) -> { this.setTeams(n.getBooleanValue()); });
        deserializerMap.put("visio", (n) -> { this.setVisio(n.getBooleanValue()); });
        deserializerMap.put("word", (n) -> { this.setWord(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groove property value. The value for if MS Office OneDrive for Business - Groove should be excluded or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGroove() {
        return this.backingStore.get("groove");
    }
    /**
     * Gets the infoPath property value. The value for if MS Office InfoPath should be excluded or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getInfoPath() {
        return this.backingStore.get("infoPath");
    }
    /**
     * Gets the lync property value. The value for if MS Office Skype for Business - Lync should be excluded or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLync() {
        return this.backingStore.get("lync");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the oneDrive property value. The value for if MS Office OneDrive should be excluded or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOneDrive() {
        return this.backingStore.get("oneDrive");
    }
    /**
     * Gets the oneNote property value. The value for if MS Office OneNote should be excluded or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOneNote() {
        return this.backingStore.get("oneNote");
    }
    /**
     * Gets the outlook property value. The value for if MS Office Outlook should be excluded or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOutlook() {
        return this.backingStore.get("outlook");
    }
    /**
     * Gets the powerPoint property value. The value for if MS Office PowerPoint should be excluded or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPowerPoint() {
        return this.backingStore.get("powerPoint");
    }
    /**
     * Gets the publisher property value. The value for if MS Office Publisher should be excluded or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPublisher() {
        return this.backingStore.get("publisher");
    }
    /**
     * Gets the sharePointDesigner property value. The value for if MS Office SharePointDesigner should be excluded or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSharePointDesigner() {
        return this.backingStore.get("sharePointDesigner");
    }
    /**
     * Gets the teams property value. The value for if MS Office Teams should be excluded or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTeams() {
        return this.backingStore.get("teams");
    }
    /**
     * Gets the visio property value. The value for if MS Office Visio should be excluded or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getVisio() {
        return this.backingStore.get("visio");
    }
    /**
     * Gets the word property value. The value for if MS Office Word should be excluded or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWord() {
        return this.backingStore.get("word");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("access", this.getAccess());
        writer.writeBooleanValue("bing", this.getBing());
        writer.writeBooleanValue("excel", this.getExcel());
        writer.writeBooleanValue("groove", this.getGroove());
        writer.writeBooleanValue("infoPath", this.getInfoPath());
        writer.writeBooleanValue("lync", this.getLync());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("oneDrive", this.getOneDrive());
        writer.writeBooleanValue("oneNote", this.getOneNote());
        writer.writeBooleanValue("outlook", this.getOutlook());
        writer.writeBooleanValue("powerPoint", this.getPowerPoint());
        writer.writeBooleanValue("publisher", this.getPublisher());
        writer.writeBooleanValue("sharePointDesigner", this.getSharePointDesigner());
        writer.writeBooleanValue("teams", this.getTeams());
        writer.writeBooleanValue("visio", this.getVisio());
        writer.writeBooleanValue("word", this.getWord());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the access property value. The value for if MS Office Access should be excluded or not.
     * @param value Value to set for the access property.
     */
    public void setAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("access", value);
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
     * Sets the bing property value. The value for if Microsoft Search as default should be excluded or not.
     * @param value Value to set for the bing property.
     */
    public void setBing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bing", value);
    }
    /**
     * Sets the excel property value. The value for if MS Office Excel should be excluded or not.
     * @param value Value to set for the excel property.
     */
    public void setExcel(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("excel", value);
    }
    /**
     * Sets the groove property value. The value for if MS Office OneDrive for Business - Groove should be excluded or not.
     * @param value Value to set for the groove property.
     */
    public void setGroove(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("groove", value);
    }
    /**
     * Sets the infoPath property value. The value for if MS Office InfoPath should be excluded or not.
     * @param value Value to set for the infoPath property.
     */
    public void setInfoPath(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("infoPath", value);
    }
    /**
     * Sets the lync property value. The value for if MS Office Skype for Business - Lync should be excluded or not.
     * @param value Value to set for the lync property.
     */
    public void setLync(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("lync", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the oneDrive property value. The value for if MS Office OneDrive should be excluded or not.
     * @param value Value to set for the oneDrive property.
     */
    public void setOneDrive(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("oneDrive", value);
    }
    /**
     * Sets the oneNote property value. The value for if MS Office OneNote should be excluded or not.
     * @param value Value to set for the oneNote property.
     */
    public void setOneNote(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("oneNote", value);
    }
    /**
     * Sets the outlook property value. The value for if MS Office Outlook should be excluded or not.
     * @param value Value to set for the outlook property.
     */
    public void setOutlook(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("outlook", value);
    }
    /**
     * Sets the powerPoint property value. The value for if MS Office PowerPoint should be excluded or not.
     * @param value Value to set for the powerPoint property.
     */
    public void setPowerPoint(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("powerPoint", value);
    }
    /**
     * Sets the publisher property value. The value for if MS Office Publisher should be excluded or not.
     * @param value Value to set for the publisher property.
     */
    public void setPublisher(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("publisher", value);
    }
    /**
     * Sets the sharePointDesigner property value. The value for if MS Office SharePointDesigner should be excluded or not.
     * @param value Value to set for the sharePointDesigner property.
     */
    public void setSharePointDesigner(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("sharePointDesigner", value);
    }
    /**
     * Sets the teams property value. The value for if MS Office Teams should be excluded or not.
     * @param value Value to set for the teams property.
     */
    public void setTeams(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("teams", value);
    }
    /**
     * Sets the visio property value. The value for if MS Office Visio should be excluded or not.
     * @param value Value to set for the visio property.
     */
    public void setVisio(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("visio", value);
    }
    /**
     * Sets the word property value. The value for if MS Office Word should be excluded or not.
     * @param value Value to set for the word property.
     */
    public void setWord(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("word", value);
    }
}
