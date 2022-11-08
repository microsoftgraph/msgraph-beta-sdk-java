package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationLinkedObjects implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The manager property */
    private SynchronizationJobSubject _manager;
    /** All group members that you would like to provision. */
    private java.util.List<SynchronizationJobSubject> _members;
    /** The OdataType property */
    private String _odataType;
    /** The owners property */
    private java.util.List<SynchronizationJobSubject> _owners;
    /**
     * Instantiates a new synchronizationLinkedObjects and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SynchronizationLinkedObjects() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.synchronizationLinkedObjects");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationLinkedObjects
     */
    @javax.annotation.Nonnull
    public static SynchronizationLinkedObjects createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationLinkedObjects();
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
        final SynchronizationLinkedObjects currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("manager", (n) -> { currentObject.setManager(n.getObjectValue(SynchronizationJobSubject::createFromDiscriminatorValue)); });
            this.put("members", (n) -> { currentObject.setMembers(n.getCollectionOfObjectValues(SynchronizationJobSubject::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("owners", (n) -> { currentObject.setOwners(n.getCollectionOfObjectValues(SynchronizationJobSubject::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the manager property value. The manager property
     * @return a synchronizationJobSubject
     */
    @javax.annotation.Nullable
    public SynchronizationJobSubject getManager() {
        return this._manager;
    }
    /**
     * Gets the members property value. All group members that you would like to provision.
     * @return a synchronizationJobSubject
     */
    @javax.annotation.Nullable
    public java.util.List<SynchronizationJobSubject> getMembers() {
        return this._members;
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
     * Gets the owners property value. The owners property
     * @return a synchronizationJobSubject
     */
    @javax.annotation.Nullable
    public java.util.List<SynchronizationJobSubject> getOwners() {
        return this._owners;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("manager", this.getManager());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("owners", this.getOwners());
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
     * Sets the manager property value. The manager property
     * @param value Value to set for the manager property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManager(@javax.annotation.Nullable final SynchronizationJobSubject value) {
        this._manager = value;
    }
    /**
     * Sets the members property value. All group members that you would like to provision.
     * @param value Value to set for the members property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembers(@javax.annotation.Nullable final java.util.List<SynchronizationJobSubject> value) {
        this._members = value;
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
     * Sets the owners property value. The owners property
     * @param value Value to set for the owners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwners(@javax.annotation.Nullable final java.util.List<SynchronizationJobSubject> value) {
        this._owners = value;
    }
}
