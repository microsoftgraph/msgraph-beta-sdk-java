package com.microsoft.graph.users.item.manageddevices.item.restorecloudpc;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the restoreCloudPc method. */
public class RestoreCloudPcPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The cloudPcSnapshotId property */
    private String _cloudPcSnapshotId;
    /**
     * Instantiates a new restoreCloudPcPostRequestBody and sets the default values.
     * @return a void
     */
    public RestoreCloudPcPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a restoreCloudPcPostRequestBody
     */
    @javax.annotation.Nonnull
    public static RestoreCloudPcPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RestoreCloudPcPostRequestBody();
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
     * Gets the cloudPcSnapshotId property value. The cloudPcSnapshotId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudPcSnapshotId() {
        return this._cloudPcSnapshotId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RestoreCloudPcPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(1) {{
            this.put("cloudPcSnapshotId", (n) -> { currentObject.setCloudPcSnapshotId(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloudPcSnapshotId", this.getCloudPcSnapshotId());
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
     * Sets the cloudPcSnapshotId property value. The cloudPcSnapshotId property
     * @param value Value to set for the cloudPcSnapshotId property.
     * @return a void
     */
    public void setCloudPcSnapshotId(@javax.annotation.Nullable final String value) {
        this._cloudPcSnapshotId = value;
    }
}
