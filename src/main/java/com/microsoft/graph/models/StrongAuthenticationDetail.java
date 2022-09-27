package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class StrongAuthenticationDetail extends Entity implements Parsable {
    /** The encryptedPinHashHistory property */
    private byte[] _encryptedPinHashHistory;
    /** The proofupTime property */
    private Long _proofupTime;
    /**
     * Instantiates a new StrongAuthenticationDetail and sets the default values.
     * @return a void
     */
    public StrongAuthenticationDetail() {
        super();
        this.setOdataType("#microsoft.graph.strongAuthenticationDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a StrongAuthenticationDetail
     */
    @javax.annotation.Nonnull
    public static StrongAuthenticationDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StrongAuthenticationDetail();
    }
    /**
     * Gets the encryptedPinHashHistory property value. The encryptedPinHashHistory property
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getEncryptedPinHashHistory() {
        return this._encryptedPinHashHistory;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final StrongAuthenticationDetail currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("encryptedPinHashHistory", (n) -> { currentObject.setEncryptedPinHashHistory(n.getByteArrayValue()); });
            this.put("proofupTime", (n) -> { currentObject.setProofupTime(n.getLongValue()); });
        }};
    }
    /**
     * Gets the proofupTime property value. The proofupTime property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getProofupTime() {
        return this._proofupTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("encryptedPinHashHistory", this.getEncryptedPinHashHistory());
        writer.writeLongValue("proofupTime", this.getProofupTime());
    }
    /**
     * Sets the encryptedPinHashHistory property value. The encryptedPinHashHistory property
     * @param value Value to set for the encryptedPinHashHistory property.
     * @return a void
     */
    public void setEncryptedPinHashHistory(@javax.annotation.Nullable final byte[] value) {
        this._encryptedPinHashHistory = value;
    }
    /**
     * Sets the proofupTime property value. The proofupTime property
     * @param value Value to set for the proofupTime property.
     * @return a void
     */
    public void setProofupTime(@javax.annotation.Nullable final Long value) {
        this._proofupTime = value;
    }
}
