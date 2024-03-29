<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Rendez_vous extends Model
{
    use HasFactory;
    public function users(){
        return $this->belongsTo("App\Models\User","user_id");
    }
    public function consultations(){
        return $this->belongsTo("App\Models\Consultation","cons_id");
    }
}
