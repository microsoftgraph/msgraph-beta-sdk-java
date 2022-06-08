package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the identityGovernance singleton. */
public class CustomExtensionHandler extends Entity implements Parsable {
    /** Indicates which custom workflow extension will be executed at this stage. Nullable. Supports $expand. */
    private CustomAccessPackageWorkflowExtension _customExtension;
    /** Indicates the stage of the access package assignment request workflow when the access package custom extension runs. The possible values are: assignmentRequestCreated, assignmentRequestApproved, assignmentRequestGranted, assignmentRequestRemoved, assignmentFourteenDaysBeforeExpiration, assignmentOneDayBeforeExpiration, unknownFutureValue. */
    private AccessPackageCustomExtensionStage _stage;
    /**
     * Instantiates a new customExtensionHandler and sets the default values.
     * @return a void
     */
    public CustomExtensionHandler() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customExtensionHandler
     */
    @javax.annotation.Nonnull
    public static CustomExtensionHandler createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomExtensionHandler();
    }
    /**
     * Gets the customExtension property value. Indicates which custom workflow extension will be executed at this stage. Nullable. Supports $expand.
     * @return a customAccessPackageWorkflowExtension
     */
    @javax.annotation.Nullable
    public CustomAccessPackageWorkflowExtension getCustomExtension() {
        return this._customExtension;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CustomExtensionHandler currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("customExtension", (n) -> { currentObject.setCustomExtension(n.getObjectValue(CustomAccessPackageWorkflowExtension::createFromDiscriminatorValue)); });
            this.put("stage", (n) -> { currentObject.setStage(n.getEnumValue(AccessPackageCustomExtensionStage.class)); });
        }};
    }
    /**
     * Gets the stage property value. Indicates the stage of the access package assignment request workflow when the access package custom extension runs. The possible values are: assignmentRequestCreated, assignmentRequestApproved, assignmentRequestGranted, assignmentRequestRemoved, assignmentFourteenDaysBeforeExpiration, assignmentOneDayBeforeExpiration, unknownFutureValue.
     * @return a accessPackageCustomExtensionStage
     */
    @javax.annotation.Nullable
    public AccessPackageCustomExtensionStage getStage() {
        return this._stage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("customExtension", this.getCustomExtension());
        writer.writeEnumValue("stage", this.getStage());
    }
    /**
     * Sets the customExtension property value. Indicates which custom workflow extension will be executed at this stage. Nullable. Supports $expand.
     * @param value Value to set for the customExtension property.
     * @return a void
     */
    public void setCustomExtension(@javax.annotation.Nullable final CustomAccessPackageWorkflowExtension value) {
        this._customExtension = value;
    }
    /**
     * Sets the stage property value. Indicates the stage of the access package assignment request workflow when the access package custom extension runs. The possible values are: assignmentRequestCreated, assignmentRequestApproved, assignmentRequestGranted, assignmentRequestRemoved, assignmentFourteenDaysBeforeExpiration, assignmentOneDayBeforeExpiration, unknownFutureValue.
     * @param value Value to set for the stage property.
     * @return a void
     */
    public void setStage(@javax.annotation.Nullable final AccessPackageCustomExtensionStage value) {
        this._stage = value;
    }
}
