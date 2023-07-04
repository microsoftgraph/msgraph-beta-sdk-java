package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for Excluded Office365 Apps.
 */
public class ExcludedApps implements AdditionalDataHolder, Parsable {
    /**
     * The value for if MS Office Access should be excluded or not.
     */
    private Boolean access;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The value for if Microsoft Search as default should be excluded or not.
     */
    private Boolean bing;
    /**
     * The value for if MS Office Excel should be excluded or not.
     */
    private Boolean excel;
    /**
     * The value for if MS Office OneDrive for Business - Groove should be excluded or not.
     */
    private Boolean groove;
    /**
     * The value for if MS Office InfoPath should be excluded or not.
     */
    private Boolean infoPath;
    /**
     * The value for if MS Office Skype for Business - Lync should be excluded or not.
     */
    private Boolean lync;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The value for if MS Office OneDrive should be excluded or not.
     */
    private Boolean oneDrive;
    /**
     * The value for if MS Office OneNote should be excluded or not.
     */
    private Boolean oneNote;
    /**
     * The value for if MS Office Outlook should be excluded or not.
     */
    private Boolean outlook;
    /**
     * The value for if MS Office PowerPoint should be excluded or not.
     */
    private Boolean powerPoint;
    /**
     * The value for if MS Office Publisher should be excluded or not.
     */
    private Boolean publisher;
    /**
     * The value for if MS Office SharePointDesigner should be excluded or not.
     */
    private Boolean sharePointDesigner;
    /**
     * The value for if MS Office Teams should be excluded or not.
     */
    private Boolean teams;
    /**
     * The value for if MS Office Visio should be excluded or not.
     */
    private Boolean visio;
    /**
     * The value for if MS Office Word should be excluded or not.
     */
    private Boolean word;
    /**
     * Instantiates a new excludedApps and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExcludedApps() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a excludedApps
     */
    @javax.annotation.Nonnull
    public static ExcludedApps createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExcludedApps();
    }
    /**
     * Gets the access property value. The value for if MS Office Access should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccess() {
        return this.access;
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
     * Gets the bing property value. The value for if Microsoft Search as default should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBing() {
        return this.bing;
    }
    /**
     * Gets the excel property value. The value for if MS Office Excel should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExcel() {
        return this.excel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGroove() {
        return this.groove;
    }
    /**
     * Gets the infoPath property value. The value for if MS Office InfoPath should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInfoPath() {
        return this.infoPath;
    }
    /**
     * Gets the lync property value. The value for if MS Office Skype for Business - Lync should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLync() {
        return this.lync;
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
     * Gets the oneDrive property value. The value for if MS Office OneDrive should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOneDrive() {
        return this.oneDrive;
    }
    /**
     * Gets the oneNote property value. The value for if MS Office OneNote should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOneNote() {
        return this.oneNote;
    }
    /**
     * Gets the outlook property value. The value for if MS Office Outlook should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOutlook() {
        return this.outlook;
    }
    /**
     * Gets the powerPoint property value. The value for if MS Office PowerPoint should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPowerPoint() {
        return this.powerPoint;
    }
    /**
     * Gets the publisher property value. The value for if MS Office Publisher should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPublisher() {
        return this.publisher;
    }
    /**
     * Gets the sharePointDesigner property value. The value for if MS Office SharePointDesigner should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSharePointDesigner() {
        return this.sharePointDesigner;
    }
    /**
     * Gets the teams property value. The value for if MS Office Teams should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTeams() {
        return this.teams;
    }
    /**
     * Gets the visio property value. The value for if MS Office Visio should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVisio() {
        return this.visio;
    }
    /**
     * Gets the word property value. The value for if MS Office Word should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWord() {
        return this.word;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccess(@javax.annotation.Nullable final Boolean value) {
        this.access = value;
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
     * Sets the bing property value. The value for if Microsoft Search as default should be excluded or not.
     * @param value Value to set for the bing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBing(@javax.annotation.Nullable final Boolean value) {
        this.bing = value;
    }
    /**
     * Sets the excel property value. The value for if MS Office Excel should be excluded or not.
     * @param value Value to set for the excel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcel(@javax.annotation.Nullable final Boolean value) {
        this.excel = value;
    }
    /**
     * Sets the groove property value. The value for if MS Office OneDrive for Business - Groove should be excluded or not.
     * @param value Value to set for the groove property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroove(@javax.annotation.Nullable final Boolean value) {
        this.groove = value;
    }
    /**
     * Sets the infoPath property value. The value for if MS Office InfoPath should be excluded or not.
     * @param value Value to set for the infoPath property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInfoPath(@javax.annotation.Nullable final Boolean value) {
        this.infoPath = value;
    }
    /**
     * Sets the lync property value. The value for if MS Office Skype for Business - Lync should be excluded or not.
     * @param value Value to set for the lync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLync(@javax.annotation.Nullable final Boolean value) {
        this.lync = value;
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
    /**
     * Sets the oneDrive property value. The value for if MS Office OneDrive should be excluded or not.
     * @param value Value to set for the oneDrive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOneDrive(@javax.annotation.Nullable final Boolean value) {
        this.oneDrive = value;
    }
    /**
     * Sets the oneNote property value. The value for if MS Office OneNote should be excluded or not.
     * @param value Value to set for the oneNote property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOneNote(@javax.annotation.Nullable final Boolean value) {
        this.oneNote = value;
    }
    /**
     * Sets the outlook property value. The value for if MS Office Outlook should be excluded or not.
     * @param value Value to set for the outlook property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutlook(@javax.annotation.Nullable final Boolean value) {
        this.outlook = value;
    }
    /**
     * Sets the powerPoint property value. The value for if MS Office PowerPoint should be excluded or not.
     * @param value Value to set for the powerPoint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerPoint(@javax.annotation.Nullable final Boolean value) {
        this.powerPoint = value;
    }
    /**
     * Sets the publisher property value. The value for if MS Office Publisher should be excluded or not.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final Boolean value) {
        this.publisher = value;
    }
    /**
     * Sets the sharePointDesigner property value. The value for if MS Office SharePointDesigner should be excluded or not.
     * @param value Value to set for the sharePointDesigner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharePointDesigner(@javax.annotation.Nullable final Boolean value) {
        this.sharePointDesigner = value;
    }
    /**
     * Sets the teams property value. The value for if MS Office Teams should be excluded or not.
     * @param value Value to set for the teams property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeams(@javax.annotation.Nullable final Boolean value) {
        this.teams = value;
    }
    /**
     * Sets the visio property value. The value for if MS Office Visio should be excluded or not.
     * @param value Value to set for the visio property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVisio(@javax.annotation.Nullable final Boolean value) {
        this.visio = value;
    }
    /**
     * Sets the word property value. The value for if MS Office Word should be excluded or not.
     * @param value Value to set for the word property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWord(@javax.annotation.Nullable final Boolean value) {
        this.word = value;
    }
}
