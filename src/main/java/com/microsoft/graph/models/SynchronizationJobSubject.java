package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationJobSubject implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The links property */
    private SynchronizationLinkedObjects _links;
    /** The identifier of an object to which a synchronizationJob is to be applied. Can be one of the following: An onPremisesDistinguishedName for synchronization from Active Directory to Azure AD.The user ID for synchronization from Azure AD to a third-party.The Worker ID of the Workday worker for synchronization from Workday to either Active Directory or Azure AD. */
    private String _objectId;
    /** The type of the object to which a synchronizationJob is to be applied. Can be one of the following: user for synchronization from Active Directory to Azure AD.User for synchronization from Azure AD to a third-party application. Worker for synchronization from Workday to either Active Directory or Azure AD. */
    private String _objectTypeName;
    /**
     * Instantiates a new synchronizationJobSubject and sets the default values.
     * @return a void
     */
    public SynchronizationJobSubject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationJobSubject
     */
    @javax.annotation.Nonnull
    public static SynchronizationJobSubject createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationJobSubject();
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
        final SynchronizationJobSubject currentObject = this;
        return new HashMap<>(3) {{
            this.put("links", (n) -> { currentObject.setLinks(n.getObjectValue(SynchronizationLinkedObjects::createFromDiscriminatorValue)); });
            this.put("objectId", (n) -> { currentObject.setObjectId(n.getStringValue()); });
            this.put("objectTypeName", (n) -> { currentObject.setObjectTypeName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the links property value. The links property
     * @return a synchronizationLinkedObjects
     */
    @javax.annotation.Nullable
    public SynchronizationLinkedObjects getLinks() {
        return this._links;
    }
    /**
     * Gets the objectId property value. The identifier of an object to which a synchronizationJob is to be applied. Can be one of the following: An onPremisesDistinguishedName for synchronization from Active Directory to Azure AD.The user ID for synchronization from Azure AD to a third-party.The Worker ID of the Workday worker for synchronization from Workday to either Active Directory or Azure AD.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getObjectId() {
        return this._objectId;
    }
    /**
     * Gets the objectTypeName property value. The type of the object to which a synchronizationJob is to be applied. Can be one of the following: user for synchronization from Active Directory to Azure AD.User for synchronization from Azure AD to a third-party application. Worker for synchronization from Workday to either Active Directory or Azure AD.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getObjectTypeName() {
        return this._objectTypeName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("links", this.getLinks());
        writer.writeStringValue("objectId", this.getObjectId());
        writer.writeStringValue("objectTypeName", this.getObjectTypeName());
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
     * Sets the links property value. The links property
     * @param value Value to set for the links property.
     * @return a void
     */
    public void setLinks(@javax.annotation.Nullable final SynchronizationLinkedObjects value) {
        this._links = value;
    }
    /**
     * Sets the objectId property value. The identifier of an object to which a synchronizationJob is to be applied. Can be one of the following: An onPremisesDistinguishedName for synchronization from Active Directory to Azure AD.The user ID for synchronization from Azure AD to a third-party.The Worker ID of the Workday worker for synchronization from Workday to either Active Directory or Azure AD.
     * @param value Value to set for the objectId property.
     * @return a void
     */
    public void setObjectId(@javax.annotation.Nullable final String value) {
        this._objectId = value;
    }
    /**
     * Sets the objectTypeName property value. The type of the object to which a synchronizationJob is to be applied. Can be one of the following: user for synchronization from Active Directory to Azure AD.User for synchronization from Azure AD to a third-party application. Worker for synchronization from Workday to either Active Directory or Azure AD.
     * @param value Value to set for the objectTypeName property.
     * @return a void
     */
    public void setObjectTypeName(@javax.annotation.Nullable final String value) {
        this._objectTypeName = value;
    }
}
