package microsoft.graph.deviceappmanagement.ioslobappprovisioningconfigurations.item.assign;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.IosLobAppProvisioningConfigurationAssignment;
import microsoft.graph.models.MobileAppProvisioningConfigGroupAssignment;
/** Provides operations to call the assign method. */
public class AssignPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The appProvisioningConfigurationGroupAssignments property */
    private java.util.List<MobileAppProvisioningConfigGroupAssignment> _appProvisioningConfigurationGroupAssignments;
    /** The iOSLobAppProvisioningConfigAssignments property */
    private java.util.List<IosLobAppProvisioningConfigurationAssignment> _iOSLobAppProvisioningConfigAssignments;
    /**
     * Instantiates a new assignPostRequestBody and sets the default values.
     * @return a void
     */
    public AssignPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignPostRequestBody
     */
    @javax.annotation.Nonnull
    public static AssignPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignPostRequestBody();
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
     * Gets the appProvisioningConfigurationGroupAssignments property value. The appProvisioningConfigurationGroupAssignments property
     * @return a mobileAppProvisioningConfigGroupAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppProvisioningConfigGroupAssignment> getAppProvisioningConfigurationGroupAssignments() {
        return this._appProvisioningConfigurationGroupAssignments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AssignPostRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("appProvisioningConfigurationGroupAssignments", (n) -> { currentObject.setAppProvisioningConfigurationGroupAssignments(n.getCollectionOfObjectValues(MobileAppProvisioningConfigGroupAssignment::createFromDiscriminatorValue)); });
            this.put("iOSLobAppProvisioningConfigAssignments", (n) -> { currentObject.setIOSLobAppProvisioningConfigAssignments(n.getCollectionOfObjectValues(IosLobAppProvisioningConfigurationAssignment::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the iOSLobAppProvisioningConfigAssignments property value. The iOSLobAppProvisioningConfigAssignments property
     * @return a iosLobAppProvisioningConfigurationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<IosLobAppProvisioningConfigurationAssignment> getIOSLobAppProvisioningConfigAssignments() {
        return this._iOSLobAppProvisioningConfigAssignments;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("appProvisioningConfigurationGroupAssignments", this.getAppProvisioningConfigurationGroupAssignments());
        writer.writeCollectionOfObjectValues("iOSLobAppProvisioningConfigAssignments", this.getIOSLobAppProvisioningConfigAssignments());
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
     * Sets the appProvisioningConfigurationGroupAssignments property value. The appProvisioningConfigurationGroupAssignments property
     * @param value Value to set for the appProvisioningConfigurationGroupAssignments property.
     * @return a void
     */
    public void setAppProvisioningConfigurationGroupAssignments(@javax.annotation.Nullable final java.util.List<MobileAppProvisioningConfigGroupAssignment> value) {
        this._appProvisioningConfigurationGroupAssignments = value;
    }
    /**
     * Sets the iOSLobAppProvisioningConfigAssignments property value. The iOSLobAppProvisioningConfigAssignments property
     * @param value Value to set for the iOSLobAppProvisioningConfigAssignments property.
     * @return a void
     */
    public void setIOSLobAppProvisioningConfigAssignments(@javax.annotation.Nullable final java.util.List<IosLobAppProvisioningConfigurationAssignment> value) {
        this._iOSLobAppProvisioningConfigAssignments = value;
    }
}
