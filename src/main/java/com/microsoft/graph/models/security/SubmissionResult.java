package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubmissionResult implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The submission result category. The possible values are: notJunk, spam, phishing, malware, allowedByPolicy, blockedByPolicy, spoof, unknown, noResultAvailable and unkownFutureValue.
     */
    private SubmissionResultCategory category;
    /**
     * Specifies the extra details provided by Microsoft to substantiate their analysis result.
     */
    private SubmissionResultDetail detail;
    /**
     * Specifies the files detected by Microsoft in the submitted emails.
     */
    private java.util.List<SubmissionDetectedFile> detectedFiles;
    /**
     * Specifies the URLs detected by Microsoft in the submitted email.
     */
    private java.util.List<String> detectedUrls;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Specifies the setting for user mailbox denoted by a comma-separated string.
     */
    private EnumSet<UserMailboxSetting> userMailboxSetting;
    /**
     * Instantiates a new submissionResult and sets the default values.
     */
    public SubmissionResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a submissionResult
     */
    @jakarta.annotation.Nonnull
    public static SubmissionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubmissionResult();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the category property value. The submission result category. The possible values are: notJunk, spam, phishing, malware, allowedByPolicy, blockedByPolicy, spoof, unknown, noResultAvailable and unkownFutureValue.
     * @return a submissionResultCategory
     */
    @jakarta.annotation.Nullable
    public SubmissionResultCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the detail property value. Specifies the extra details provided by Microsoft to substantiate their analysis result.
     * @return a submissionResultDetail
     */
    @jakarta.annotation.Nullable
    public SubmissionResultDetail getDetail() {
        return this.detail;
    }
    /**
     * Gets the detectedFiles property value. Specifies the files detected by Microsoft in the submitted emails.
     * @return a submissionDetectedFile
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubmissionDetectedFile> getDetectedFiles() {
        return this.detectedFiles;
    }
    /**
     * Gets the detectedUrls property value. Specifies the URLs detected by Microsoft in the submitted email.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDetectedUrls() {
        return this.detectedUrls;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(SubmissionResultCategory.class)); });
        deserializerMap.put("detail", (n) -> { this.setDetail(n.getEnumValue(SubmissionResultDetail.class)); });
        deserializerMap.put("detectedFiles", (n) -> { this.setDetectedFiles(n.getCollectionOfObjectValues(SubmissionDetectedFile::createFromDiscriminatorValue)); });
        deserializerMap.put("detectedUrls", (n) -> { this.setDetectedUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("userMailboxSetting", (n) -> { this.setUserMailboxSetting(n.getEnumSetValue(UserMailboxSetting.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the userMailboxSetting property value. Specifies the setting for user mailbox denoted by a comma-separated string.
     * @return a userMailboxSetting
     */
    @jakarta.annotation.Nullable
    public EnumSet<UserMailboxSetting> getUserMailboxSetting() {
        return this.userMailboxSetting;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeEnumValue("detail", this.getDetail());
        writer.writeCollectionOfObjectValues("detectedFiles", this.getDetectedFiles());
        writer.writeCollectionOfPrimitiveValues("detectedUrls", this.getDetectedUrls());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumSetValue("userMailboxSetting", this.getUserMailboxSetting());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the category property value. The submission result category. The possible values are: notJunk, spam, phishing, malware, allowedByPolicy, blockedByPolicy, spoof, unknown, noResultAvailable and unkownFutureValue.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final SubmissionResultCategory value) {
        this.category = value;
    }
    /**
     * Sets the detail property value. Specifies the extra details provided by Microsoft to substantiate their analysis result.
     * @param value Value to set for the detail property.
     */
    public void setDetail(@jakarta.annotation.Nullable final SubmissionResultDetail value) {
        this.detail = value;
    }
    /**
     * Sets the detectedFiles property value. Specifies the files detected by Microsoft in the submitted emails.
     * @param value Value to set for the detectedFiles property.
     */
    public void setDetectedFiles(@jakarta.annotation.Nullable final java.util.List<SubmissionDetectedFile> value) {
        this.detectedFiles = value;
    }
    /**
     * Sets the detectedUrls property value. Specifies the URLs detected by Microsoft in the submitted email.
     * @param value Value to set for the detectedUrls property.
     */
    public void setDetectedUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.detectedUrls = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the userMailboxSetting property value. Specifies the setting for user mailbox denoted by a comma-separated string.
     * @param value Value to set for the userMailboxSetting property.
     */
    public void setUserMailboxSetting(@jakarta.annotation.Nullable final EnumSet<UserMailboxSetting> value) {
        this.userMailboxSetting = value;
    }
}
