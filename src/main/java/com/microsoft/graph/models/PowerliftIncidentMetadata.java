package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Collection of app diagnostics associated with a user. */
public class PowerliftIncidentMetadata implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The name of the application the diagnostic is from. Example: com.microsoft.CompanyPortal */
    private String _application;
    /** The version of the application. Example: 5.2203.1 */
    private String _clientVersion;
    /** The time the app diagnostic was created. Example: 2022-04-19T17:24:45.313Z */
    private OffsetDateTime _createdAtDateTime;
    /** The unique app diagnostic identifier as a user friendly 8 character hexadecimal string. Example: 8520467A */
    private String _easyId;
    /** A list of files that are associated with the diagnostic. */
    private java.util.List<String> _fileNames;
    /** The locale information of the application. Example: en-US */
    private String _locale;
    /** The OdataType property */
    private String _odataType;
    /** The device's OS the diagnostic is from. Example: iOS */
    private String _platform;
    /** The unique identifier of the app diagnostic. Example: 8520467a-49a9-44a4-8447-8dfb8bec6726 */
    private String _powerliftId;
    /**
     * Instantiates a new powerliftIncidentMetadata and sets the default values.
     * @return a void
     */
    public PowerliftIncidentMetadata() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.powerliftIncidentMetadata");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a powerliftIncidentMetadata
     */
    @javax.annotation.Nonnull
    public static PowerliftIncidentMetadata createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PowerliftIncidentMetadata();
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
     * Gets the application property value. The name of the application the diagnostic is from. Example: com.microsoft.CompanyPortal
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplication() {
        return this._application;
    }
    /**
     * Gets the clientVersion property value. The version of the application. Example: 5.2203.1
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientVersion() {
        return this._clientVersion;
    }
    /**
     * Gets the createdAtDateTime property value. The time the app diagnostic was created. Example: 2022-04-19T17:24:45.313Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedAtDateTime() {
        return this._createdAtDateTime;
    }
    /**
     * Gets the easyId property value. The unique app diagnostic identifier as a user friendly 8 character hexadecimal string. Example: 8520467A
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEasyId() {
        return this._easyId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PowerliftIncidentMetadata currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(9) {{
            this.put("application", (n) -> { currentObject.setApplication(n.getStringValue()); });
            this.put("clientVersion", (n) -> { currentObject.setClientVersion(n.getStringValue()); });
            this.put("createdAtDateTime", (n) -> { currentObject.setCreatedAtDateTime(n.getOffsetDateTimeValue()); });
            this.put("easyId", (n) -> { currentObject.setEasyId(n.getStringValue()); });
            this.put("fileNames", (n) -> { currentObject.setFileNames(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("locale", (n) -> { currentObject.setLocale(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("platform", (n) -> { currentObject.setPlatform(n.getStringValue()); });
            this.put("powerliftId", (n) -> { currentObject.setPowerliftId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fileNames property value. A list of files that are associated with the diagnostic.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFileNames() {
        return this._fileNames;
    }
    /**
     * Gets the locale property value. The locale information of the application. Example: en-US
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocale() {
        return this._locale;
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
     * Gets the platform property value. The device's OS the diagnostic is from. Example: iOS
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlatform() {
        return this._platform;
    }
    /**
     * Gets the powerliftId property value. The unique identifier of the app diagnostic. Example: 8520467a-49a9-44a4-8447-8dfb8bec6726
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPowerliftId() {
        return this._powerliftId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("application", this.getApplication());
        writer.writeStringValue("clientVersion", this.getClientVersion());
        writer.writeOffsetDateTimeValue("createdAtDateTime", this.getCreatedAtDateTime());
        writer.writeStringValue("easyId", this.getEasyId());
        writer.writeCollectionOfPrimitiveValues("fileNames", this.getFileNames());
        writer.writeStringValue("locale", this.getLocale());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("platform", this.getPlatform());
        writer.writeStringValue("powerliftId", this.getPowerliftId());
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
     * Sets the application property value. The name of the application the diagnostic is from. Example: com.microsoft.CompanyPortal
     * @param value Value to set for the application property.
     * @return a void
     */
    public void setApplication(@javax.annotation.Nullable final String value) {
        this._application = value;
    }
    /**
     * Sets the clientVersion property value. The version of the application. Example: 5.2203.1
     * @param value Value to set for the clientVersion property.
     * @return a void
     */
    public void setClientVersion(@javax.annotation.Nullable final String value) {
        this._clientVersion = value;
    }
    /**
     * Sets the createdAtDateTime property value. The time the app diagnostic was created. Example: 2022-04-19T17:24:45.313Z
     * @param value Value to set for the createdAtDateTime property.
     * @return a void
     */
    public void setCreatedAtDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdAtDateTime = value;
    }
    /**
     * Sets the easyId property value. The unique app diagnostic identifier as a user friendly 8 character hexadecimal string. Example: 8520467A
     * @param value Value to set for the easyId property.
     * @return a void
     */
    public void setEasyId(@javax.annotation.Nullable final String value) {
        this._easyId = value;
    }
    /**
     * Sets the fileNames property value. A list of files that are associated with the diagnostic.
     * @param value Value to set for the fileNames property.
     * @return a void
     */
    public void setFileNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._fileNames = value;
    }
    /**
     * Sets the locale property value. The locale information of the application. Example: en-US
     * @param value Value to set for the locale property.
     * @return a void
     */
    public void setLocale(@javax.annotation.Nullable final String value) {
        this._locale = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the platform property value. The device's OS the diagnostic is from. Example: iOS
     * @param value Value to set for the platform property.
     * @return a void
     */
    public void setPlatform(@javax.annotation.Nullable final String value) {
        this._platform = value;
    }
    /**
     * Sets the powerliftId property value. The unique identifier of the app diagnostic. Example: 8520467a-49a9-44a4-8447-8dfb8bec6726
     * @param value Value to set for the powerliftId property.
     * @return a void
     */
    public void setPowerliftId(@javax.annotation.Nullable final String value) {
        this._powerliftId = value;
    }
}
