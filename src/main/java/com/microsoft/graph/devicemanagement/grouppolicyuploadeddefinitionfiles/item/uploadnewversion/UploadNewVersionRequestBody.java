package microsoft.graph.devicemanagement.grouppolicyuploadeddefinitionfiles.item.uploadnewversion;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.GroupPolicyUploadedLanguageFile;
/** Provides operations to call the uploadNewVersion method.  */
public class UploadNewVersionRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The content property  */
    private byte[] _content;
    /** The groupPolicyUploadedLanguageFiles property  */
    private java.util.List<GroupPolicyUploadedLanguageFile> _groupPolicyUploadedLanguageFiles;
    /**
     * Instantiates a new uploadNewVersionRequestBody and sets the default values.
     * @return a void
     */
    public UploadNewVersionRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a uploadNewVersionRequestBody
     */
    @javax.annotation.Nonnull
    public static UploadNewVersionRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UploadNewVersionRequestBody();
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
     * Gets the content property value. The content property
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getContent() {
        return this._content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UploadNewVersionRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("content", (n) -> { currentObject.setContent(n.getByteArrayValue()); });
            this.put("groupPolicyUploadedLanguageFiles", (n) -> { currentObject.setGroupPolicyUploadedLanguageFiles(n.getCollectionOfObjectValues(GroupPolicyUploadedLanguageFile::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the groupPolicyUploadedLanguageFiles property value. The groupPolicyUploadedLanguageFiles property
     * @return a groupPolicyUploadedLanguageFile
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyUploadedLanguageFile> getGroupPolicyUploadedLanguageFiles() {
        return this._groupPolicyUploadedLanguageFiles;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeCollectionOfObjectValues("groupPolicyUploadedLanguageFiles", this.getGroupPolicyUploadedLanguageFiles());
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
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final byte[] value) {
        this._content = value;
    }
    /**
     * Sets the groupPolicyUploadedLanguageFiles property value. The groupPolicyUploadedLanguageFiles property
     * @param value Value to set for the groupPolicyUploadedLanguageFiles property.
     * @return a void
     */
    public void setGroupPolicyUploadedLanguageFiles(@javax.annotation.Nullable final java.util.List<GroupPolicyUploadedLanguageFile> value) {
        this._groupPolicyUploadedLanguageFiles = value;
    }
}
