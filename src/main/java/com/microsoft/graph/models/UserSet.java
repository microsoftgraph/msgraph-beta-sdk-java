package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserSet implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** For a user in an approval stage, this property indicates whether the user is a backup fallback approver. */
    private Boolean _isBackup;
    /** The type property */
    private String _type;
    /**
     * Instantiates a new userSet and sets the default values.
     * @return a void
     */
    public UserSet() {
        this.setAdditionalData(new HashMap<>());
        this.setType("#microsoft.graph.userSet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userSet
     */
    @javax.annotation.Nonnull
    public static UserSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.connectedOrganizationMembers": return new ConnectedOrganizationMembers();
                case "#microsoft.graph.externalSponsors": return new ExternalSponsors();
                case "#microsoft.graph.groupMembers": return new GroupMembers();
                case "#microsoft.graph.internalSponsors": return new InternalSponsors();
                case "#microsoft.graph.requestorManager": return new RequestorManager();
                case "#microsoft.graph.singleUser": return new SingleUser();
            }
        }
        return new UserSet();
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
        final UserSet currentObject = this;
        return new HashMap<>(2) {{
            this.put("isBackup", (n) -> { currentObject.setIsBackup(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isBackup property value. For a user in an approval stage, this property indicates whether the user is a backup fallback approver.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBackup() {
        return this._isBackup;
    }
    /**
     * Gets the @odata.type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isBackup", this.getIsBackup());
        writer.writeStringValue("@odata.type", this.getType());
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
     * Sets the isBackup property value. For a user in an approval stage, this property indicates whether the user is a backup fallback approver.
     * @param value Value to set for the isBackup property.
     * @return a void
     */
    public void setIsBackup(@javax.annotation.Nullable final Boolean value) {
        this._isBackup = value;
    }
    /**
     * Sets the @odata.type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
