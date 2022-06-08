package microsoft.graph.devicemanagement.grouppolicymigrationreports.createmigrationreport;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.GroupPolicyObjectFile;
/** Provides operations to call the createMigrationReport method. */
public class CreateMigrationReportPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The groupPolicyObjectFile property */
    private GroupPolicyObjectFile _groupPolicyObjectFile;
    /**
     * Instantiates a new createMigrationReportPostRequestBody and sets the default values.
     * @return a void
     */
    public CreateMigrationReportPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a createMigrationReportPostRequestBody
     */
    @javax.annotation.Nonnull
    public static CreateMigrationReportPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateMigrationReportPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CreateMigrationReportPostRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("groupPolicyObjectFile", (n) -> { currentObject.setGroupPolicyObjectFile(n.getObjectValue(GroupPolicyObjectFile::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the groupPolicyObjectFile property value. The groupPolicyObjectFile property
     * @return a groupPolicyObjectFile
     */
    @javax.annotation.Nullable
    public GroupPolicyObjectFile getGroupPolicyObjectFile() {
        return this._groupPolicyObjectFile;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("groupPolicyObjectFile", this.getGroupPolicyObjectFile());
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
     * Sets the groupPolicyObjectFile property value. The groupPolicyObjectFile property
     * @param value Value to set for the groupPolicyObjectFile property.
     * @return a void
     */
    public void setGroupPolicyObjectFile(@javax.annotation.Nullable final GroupPolicyObjectFile value) {
        this._groupPolicyObjectFile = value;
    }
}
