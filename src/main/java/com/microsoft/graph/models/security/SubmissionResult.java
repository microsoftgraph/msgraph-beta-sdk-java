package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SubmissionResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The submission result category. The possible values are: notJunk, spam, phishing, malware, allowedByPolicy, blockedByPolicy, spoof, unknown, noResultAvailable and unkownFutureValue. */
    private SubmissionResultCategory _category;
    /** Specifies the additional details provided by Microsoft to substantiate their analysis result. */
    private SubmissionResultDetail _detail;
    /** Specifies the files detected by Microsoft in the submitted emails. */
    private java.util.List<SubmissionDetectedFile> _detectedFiles;
    /** Specifes the URLs detected by Microsoft in the submitted email. */
    private java.util.List<String> _detectedUrls;
    /** The OdataType property */
    private String _odataType;
    /** Specifies the setting for user mailbox denoted by a comma-separated string. */
    private UserMailboxSetting _userMailboxSetting;
    /**
     * Instantiates a new submissionResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubmissionResult() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.security.submissionResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a submissionResult
     */
    @javax.annotation.Nonnull
    public static SubmissionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubmissionResult();
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
     * Gets the category property value. The submission result category. The possible values are: notJunk, spam, phishing, malware, allowedByPolicy, blockedByPolicy, spoof, unknown, noResultAvailable and unkownFutureValue.
     * @return a submissionResultCategory
     */
    @javax.annotation.Nullable
    public SubmissionResultCategory getCategory() {
        return this._category;
    }
    /**
     * Gets the detail property value. Specifies the additional details provided by Microsoft to substantiate their analysis result.
     * @return a submissionResultDetail
     */
    @javax.annotation.Nullable
    public SubmissionResultDetail getDetail() {
        return this._detail;
    }
    /**
     * Gets the detectedFiles property value. Specifies the files detected by Microsoft in the submitted emails.
     * @return a submissionDetectedFile
     */
    @javax.annotation.Nullable
    public java.util.List<SubmissionDetectedFile> getDetectedFiles() {
        return this._detectedFiles;
    }
    /**
     * Gets the detectedUrls property value. Specifes the URLs detected by Microsoft in the submitted email.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDetectedUrls() {
        return this._detectedUrls;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SubmissionResult currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(SubmissionResultCategory.class)); });
        deserializerMap.put("detail", (n) -> { currentObject.setDetail(n.getEnumValue(SubmissionResultDetail.class)); });
        deserializerMap.put("detectedFiles", (n) -> { currentObject.setDetectedFiles(n.getCollectionOfObjectValues(SubmissionDetectedFile::createFromDiscriminatorValue)); });
        deserializerMap.put("detectedUrls", (n) -> { currentObject.setDetectedUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("userMailboxSetting", (n) -> { currentObject.setUserMailboxSetting(n.getEnumValue(UserMailboxSetting.class)); });
        return deserializerMap;
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
     * Gets the userMailboxSetting property value. Specifies the setting for user mailbox denoted by a comma-separated string.
     * @return a userMailboxSetting
     */
    @javax.annotation.Nullable
    public UserMailboxSetting getUserMailboxSetting() {
        return this._userMailboxSetting;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeEnumValue("detail", this.getDetail());
        writer.writeCollectionOfObjectValues("detectedFiles", this.getDetectedFiles());
        writer.writeCollectionOfPrimitiveValues("detectedUrls", this.getDetectedUrls());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("userMailboxSetting", this.getUserMailboxSetting());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the category property value. The submission result category. The possible values are: notJunk, spam, phishing, malware, allowedByPolicy, blockedByPolicy, spoof, unknown, noResultAvailable and unkownFutureValue.
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final SubmissionResultCategory value) {
        this._category = value;
    }
    /**
     * Sets the detail property value. Specifies the additional details provided by Microsoft to substantiate their analysis result.
     * @param value Value to set for the detail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetail(@javax.annotation.Nullable final SubmissionResultDetail value) {
        this._detail = value;
    }
    /**
     * Sets the detectedFiles property value. Specifies the files detected by Microsoft in the submitted emails.
     * @param value Value to set for the detectedFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectedFiles(@javax.annotation.Nullable final java.util.List<SubmissionDetectedFile> value) {
        this._detectedFiles = value;
    }
    /**
     * Sets the detectedUrls property value. Specifes the URLs detected by Microsoft in the submitted email.
     * @param value Value to set for the detectedUrls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectedUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._detectedUrls = value;
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
     * Sets the userMailboxSetting property value. Specifies the setting for user mailbox denoted by a comma-separated string.
     * @param value Value to set for the userMailboxSetting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserMailboxSetting(@javax.annotation.Nullable final UserMailboxSetting value) {
        this._userMailboxSetting = value;
    }
}
