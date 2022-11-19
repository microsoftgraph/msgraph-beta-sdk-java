package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties for Excluded Office365 Apps. */
public class ExcludedApps implements AdditionalDataHolder, Parsable {
    /** The value for if MS Office Access should be excluded or not. */
    private Boolean _access;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The value for if Microsoft Search as default should be excluded or not. */
    private Boolean _bing;
    /** The value for if MS Office Excel should be excluded or not. */
    private Boolean _excel;
    /** The value for if MS Office OneDrive for Business - Groove should be excluded or not. */
    private Boolean _groove;
    /** The value for if MS Office InfoPath should be excluded or not. */
    private Boolean _infoPath;
    /** The value for if MS Office Skype for Business - Lync should be excluded or not. */
    private Boolean _lync;
    /** The OdataType property */
    private String _odataType;
    /** The value for if MS Office OneDrive should be excluded or not. */
    private Boolean _oneDrive;
    /** The value for if MS Office OneNote should be excluded or not. */
    private Boolean _oneNote;
    /** The value for if MS Office Outlook should be excluded or not. */
    private Boolean _outlook;
    /** The value for if MS Office PowerPoint should be excluded or not. */
    private Boolean _powerPoint;
    /** The value for if MS Office Publisher should be excluded or not. */
    private Boolean _publisher;
    /** The value for if MS Office SharePointDesigner should be excluded or not. */
    private Boolean _sharePointDesigner;
    /** The value for if MS Office Teams should be excluded or not. */
    private Boolean _teams;
    /** The value for if MS Office Visio should be excluded or not. */
    private Boolean _visio;
    /** The value for if MS Office Word should be excluded or not. */
    private Boolean _word;
    /**
     * Instantiates a new excludedApps and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExcludedApps() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.excludedApps");
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
        return this._access;
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
     * Gets the bing property value. The value for if Microsoft Search as default should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBing() {
        return this._bing;
    }
    /**
     * Gets the excel property value. The value for if MS Office Excel should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExcel() {
        return this._excel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExcludedApps currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(16);
        deserializerMap.put("access", (n) -> { currentObject.setAccess(n.getBooleanValue()); });
        deserializerMap.put("bing", (n) -> { currentObject.setBing(n.getBooleanValue()); });
        deserializerMap.put("excel", (n) -> { currentObject.setExcel(n.getBooleanValue()); });
        deserializerMap.put("groove", (n) -> { currentObject.setGroove(n.getBooleanValue()); });
        deserializerMap.put("infoPath", (n) -> { currentObject.setInfoPath(n.getBooleanValue()); });
        deserializerMap.put("lync", (n) -> { currentObject.setLync(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("oneDrive", (n) -> { currentObject.setOneDrive(n.getBooleanValue()); });
        deserializerMap.put("oneNote", (n) -> { currentObject.setOneNote(n.getBooleanValue()); });
        deserializerMap.put("outlook", (n) -> { currentObject.setOutlook(n.getBooleanValue()); });
        deserializerMap.put("powerPoint", (n) -> { currentObject.setPowerPoint(n.getBooleanValue()); });
        deserializerMap.put("publisher", (n) -> { currentObject.setPublisher(n.getBooleanValue()); });
        deserializerMap.put("sharePointDesigner", (n) -> { currentObject.setSharePointDesigner(n.getBooleanValue()); });
        deserializerMap.put("teams", (n) -> { currentObject.setTeams(n.getBooleanValue()); });
        deserializerMap.put("visio", (n) -> { currentObject.setVisio(n.getBooleanValue()); });
        deserializerMap.put("word", (n) -> { currentObject.setWord(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groove property value. The value for if MS Office OneDrive for Business - Groove should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGroove() {
        return this._groove;
    }
    /**
     * Gets the infoPath property value. The value for if MS Office InfoPath should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInfoPath() {
        return this._infoPath;
    }
    /**
     * Gets the lync property value. The value for if MS Office Skype for Business - Lync should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLync() {
        return this._lync;
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
     * Gets the oneDrive property value. The value for if MS Office OneDrive should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOneDrive() {
        return this._oneDrive;
    }
    /**
     * Gets the oneNote property value. The value for if MS Office OneNote should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOneNote() {
        return this._oneNote;
    }
    /**
     * Gets the outlook property value. The value for if MS Office Outlook should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOutlook() {
        return this._outlook;
    }
    /**
     * Gets the powerPoint property value. The value for if MS Office PowerPoint should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPowerPoint() {
        return this._powerPoint;
    }
    /**
     * Gets the publisher property value. The value for if MS Office Publisher should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPublisher() {
        return this._publisher;
    }
    /**
     * Gets the sharePointDesigner property value. The value for if MS Office SharePointDesigner should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSharePointDesigner() {
        return this._sharePointDesigner;
    }
    /**
     * Gets the teams property value. The value for if MS Office Teams should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTeams() {
        return this._teams;
    }
    /**
     * Gets the visio property value. The value for if MS Office Visio should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVisio() {
        return this._visio;
    }
    /**
     * Gets the word property value. The value for if MS Office Word should be excluded or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWord() {
        return this._word;
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
        this._access = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the bing property value. The value for if Microsoft Search as default should be excluded or not.
     * @param value Value to set for the bing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBing(@javax.annotation.Nullable final Boolean value) {
        this._bing = value;
    }
    /**
     * Sets the excel property value. The value for if MS Office Excel should be excluded or not.
     * @param value Value to set for the excel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcel(@javax.annotation.Nullable final Boolean value) {
        this._excel = value;
    }
    /**
     * Sets the groove property value. The value for if MS Office OneDrive for Business - Groove should be excluded or not.
     * @param value Value to set for the groove property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroove(@javax.annotation.Nullable final Boolean value) {
        this._groove = value;
    }
    /**
     * Sets the infoPath property value. The value for if MS Office InfoPath should be excluded or not.
     * @param value Value to set for the infoPath property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInfoPath(@javax.annotation.Nullable final Boolean value) {
        this._infoPath = value;
    }
    /**
     * Sets the lync property value. The value for if MS Office Skype for Business - Lync should be excluded or not.
     * @param value Value to set for the lync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLync(@javax.annotation.Nullable final Boolean value) {
        this._lync = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the oneDrive property value. The value for if MS Office OneDrive should be excluded or not.
     * @param value Value to set for the oneDrive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOneDrive(@javax.annotation.Nullable final Boolean value) {
        this._oneDrive = value;
    }
    /**
     * Sets the oneNote property value. The value for if MS Office OneNote should be excluded or not.
     * @param value Value to set for the oneNote property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOneNote(@javax.annotation.Nullable final Boolean value) {
        this._oneNote = value;
    }
    /**
     * Sets the outlook property value. The value for if MS Office Outlook should be excluded or not.
     * @param value Value to set for the outlook property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutlook(@javax.annotation.Nullable final Boolean value) {
        this._outlook = value;
    }
    /**
     * Sets the powerPoint property value. The value for if MS Office PowerPoint should be excluded or not.
     * @param value Value to set for the powerPoint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerPoint(@javax.annotation.Nullable final Boolean value) {
        this._powerPoint = value;
    }
    /**
     * Sets the publisher property value. The value for if MS Office Publisher should be excluded or not.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final Boolean value) {
        this._publisher = value;
    }
    /**
     * Sets the sharePointDesigner property value. The value for if MS Office SharePointDesigner should be excluded or not.
     * @param value Value to set for the sharePointDesigner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharePointDesigner(@javax.annotation.Nullable final Boolean value) {
        this._sharePointDesigner = value;
    }
    /**
     * Sets the teams property value. The value for if MS Office Teams should be excluded or not.
     * @param value Value to set for the teams property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeams(@javax.annotation.Nullable final Boolean value) {
        this._teams = value;
    }
    /**
     * Sets the visio property value. The value for if MS Office Visio should be excluded or not.
     * @param value Value to set for the visio property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVisio(@javax.annotation.Nullable final Boolean value) {
        this._visio = value;
    }
    /**
     * Sets the word property value. The value for if MS Office Word should be excluded or not.
     * @param value Value to set for the word property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWord(@javax.annotation.Nullable final Boolean value) {
        this._word = value;
    }
}
