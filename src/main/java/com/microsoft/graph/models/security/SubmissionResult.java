package microsoft.graph.models.security;

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
    /** The category property */
    private SubmissionResultCategory _category;
    /** The detail property */
    private SubmissionResultDetail _detail;
    /** The detectedFiles property */
    private java.util.List<SubmissionDetectedFile> _detectedFiles;
    /** The detectedUrls property */
    private java.util.List<String> _detectedUrls;
    /** The userMailboxSetting property */
    private UserMailboxSetting _userMailboxSetting;
    /**
     * Instantiates a new submissionResult and sets the default values.
     * @return a void
     */
    public SubmissionResult() {
        this.setAdditionalData(new HashMap<>());
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
     * Gets the category property value. The category property
     * @return a submissionResultCategory
     */
    @javax.annotation.Nullable
    public SubmissionResultCategory getCategory() {
        return this._category;
    }
    /**
     * Gets the detail property value. The detail property
     * @return a submissionResultDetail
     */
    @javax.annotation.Nullable
    public SubmissionResultDetail getDetail() {
        return this._detail;
    }
    /**
     * Gets the detectedFiles property value. The detectedFiles property
     * @return a submissionDetectedFile
     */
    @javax.annotation.Nullable
    public java.util.List<SubmissionDetectedFile> getDetectedFiles() {
        return this._detectedFiles;
    }
    /**
     * Gets the detectedUrls property value. The detectedUrls property
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
        return new HashMap<>(5) {{
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(SubmissionResultCategory.class)); });
            this.put("detail", (n) -> { currentObject.setDetail(n.getEnumValue(SubmissionResultDetail.class)); });
            this.put("detectedFiles", (n) -> { currentObject.setDetectedFiles(n.getCollectionOfObjectValues(SubmissionDetectedFile::createFromDiscriminatorValue)); });
            this.put("detectedUrls", (n) -> { currentObject.setDetectedUrls(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("userMailboxSetting", (n) -> { currentObject.setUserMailboxSetting(n.getEnumValue(UserMailboxSetting.class)); });
        }};
    }
    /**
     * Gets the userMailboxSetting property value. The userMailboxSetting property
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeEnumValue("detail", this.getDetail());
        writer.writeCollectionOfObjectValues("detectedFiles", this.getDetectedFiles());
        writer.writeCollectionOfPrimitiveValues("detectedUrls", this.getDetectedUrls());
        writer.writeEnumValue("userMailboxSetting", this.getUserMailboxSetting());
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
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    public void setCategory(@javax.annotation.Nullable final SubmissionResultCategory value) {
        this._category = value;
    }
    /**
     * Sets the detail property value. The detail property
     * @param value Value to set for the detail property.
     * @return a void
     */
    public void setDetail(@javax.annotation.Nullable final SubmissionResultDetail value) {
        this._detail = value;
    }
    /**
     * Sets the detectedFiles property value. The detectedFiles property
     * @param value Value to set for the detectedFiles property.
     * @return a void
     */
    public void setDetectedFiles(@javax.annotation.Nullable final java.util.List<SubmissionDetectedFile> value) {
        this._detectedFiles = value;
    }
    /**
     * Sets the detectedUrls property value. The detectedUrls property
     * @param value Value to set for the detectedUrls property.
     * @return a void
     */
    public void setDetectedUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._detectedUrls = value;
    }
    /**
     * Sets the userMailboxSetting property value. The userMailboxSetting property
     * @param value Value to set for the userMailboxSetting property.
     * @return a void
     */
    public void setUserMailboxSetting(@javax.annotation.Nullable final UserMailboxSetting value) {
        this._userMailboxSetting = value;
    }
}
