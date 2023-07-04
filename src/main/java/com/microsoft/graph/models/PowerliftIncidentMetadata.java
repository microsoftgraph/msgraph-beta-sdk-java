package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Collection of app diagnostics associated with a user.
 */
public class PowerliftIncidentMetadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the application the diagnostic is from. Example: com.microsoft.CompanyPortal
     */
    private String application;
    /**
     * The version of the application. Example: 5.2203.1
     */
    private String clientVersion;
    /**
     * The time the app diagnostic was created. Example: 2022-04-19T17:24:45.313Z
     */
    private OffsetDateTime createdAtDateTime;
    /**
     * The unique app diagnostic identifier as a user friendly 8 character hexadecimal string. Example: 8520467A
     */
    private String easyId;
    /**
     * A list of files that are associated with the diagnostic.
     */
    private java.util.List<String> fileNames;
    /**
     * The locale information of the application. Example: en-US
     */
    private String locale;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The device's OS the diagnostic is from. Example: iOS
     */
    private String platform;
    /**
     * The unique identifier of the app diagnostic. Example: 8520467a-49a9-44a4-8447-8dfb8bec6726
     */
    private UUID powerliftId;
    /**
     * Instantiates a new powerliftIncidentMetadata and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PowerliftIncidentMetadata() {
        this.setAdditionalData(new HashMap<>());
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
        return this.additionalData;
    }
    /**
     * Gets the application property value. The name of the application the diagnostic is from. Example: com.microsoft.CompanyPortal
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplication() {
        return this.application;
    }
    /**
     * Gets the clientVersion property value. The version of the application. Example: 5.2203.1
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientVersion() {
        return this.clientVersion;
    }
    /**
     * Gets the createdAtDateTime property value. The time the app diagnostic was created. Example: 2022-04-19T17:24:45.313Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedAtDateTime() {
        return this.createdAtDateTime;
    }
    /**
     * Gets the easyId property value. The unique app diagnostic identifier as a user friendly 8 character hexadecimal string. Example: 8520467A
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEasyId() {
        return this.easyId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("application", (n) -> { this.setApplication(n.getStringValue()); });
        deserializerMap.put("clientVersion", (n) -> { this.setClientVersion(n.getStringValue()); });
        deserializerMap.put("createdAtDateTime", (n) -> { this.setCreatedAtDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("easyId", (n) -> { this.setEasyId(n.getStringValue()); });
        deserializerMap.put("fileNames", (n) -> { this.setFileNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("locale", (n) -> { this.setLocale(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getStringValue()); });
        deserializerMap.put("powerliftId", (n) -> { this.setPowerliftId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileNames property value. A list of files that are associated with the diagnostic.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFileNames() {
        return this.fileNames;
    }
    /**
     * Gets the locale property value. The locale information of the application. Example: en-US
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocale() {
        return this.locale;
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
     * Gets the platform property value. The device's OS the diagnostic is from. Example: iOS
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlatform() {
        return this.platform;
    }
    /**
     * Gets the powerliftId property value. The unique identifier of the app diagnostic. Example: 8520467a-49a9-44a4-8447-8dfb8bec6726
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getPowerliftId() {
        return this.powerliftId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
        writer.writeUUIDValue("powerliftId", this.getPowerliftId());
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
     * Sets the application property value. The name of the application the diagnostic is from. Example: com.microsoft.CompanyPortal
     * @param value Value to set for the application property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplication(@javax.annotation.Nullable final String value) {
        this.application = value;
    }
    /**
     * Sets the clientVersion property value. The version of the application. Example: 5.2203.1
     * @param value Value to set for the clientVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientVersion(@javax.annotation.Nullable final String value) {
        this.clientVersion = value;
    }
    /**
     * Sets the createdAtDateTime property value. The time the app diagnostic was created. Example: 2022-04-19T17:24:45.313Z
     * @param value Value to set for the createdAtDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedAtDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdAtDateTime = value;
    }
    /**
     * Sets the easyId property value. The unique app diagnostic identifier as a user friendly 8 character hexadecimal string. Example: 8520467A
     * @param value Value to set for the easyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEasyId(@javax.annotation.Nullable final String value) {
        this.easyId = value;
    }
    /**
     * Sets the fileNames property value. A list of files that are associated with the diagnostic.
     * @param value Value to set for the fileNames property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this.fileNames = value;
    }
    /**
     * Sets the locale property value. The locale information of the application. Example: en-US
     * @param value Value to set for the locale property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocale(@javax.annotation.Nullable final String value) {
        this.locale = value;
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
     * Sets the platform property value. The device's OS the diagnostic is from. Example: iOS
     * @param value Value to set for the platform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatform(@javax.annotation.Nullable final String value) {
        this.platform = value;
    }
    /**
     * Sets the powerliftId property value. The unique identifier of the app diagnostic. Example: 8520467a-49a9-44a4-8447-8dfb8bec6726
     * @param value Value to set for the powerliftId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerliftId(@javax.annotation.Nullable final UUID value) {
        this.powerliftId = value;
    }
}
